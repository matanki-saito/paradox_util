import json
import os
import pathlib
import re


def load_map_from_file(file_path,
                       mapping_db,
                       match_key_pattern=None):
    """
    ＼＼٩( 'ω' )و ／／
    :param file_path: 対象のファイル
    :param mapping_db: マッピング。破壊的
    :param match_key_pattern: マッチさせるキーのパターン
    :return:
    """
    match_key_compiled_pattern = None
    if match_key_pattern is not None:
        match_key_compiled_pattern = re.compile(match_key_pattern)

    with open(file_path, 'r', encoding='utf-8') as f:
        for entry in json.load(f):
            key = entry["key"]
            original = entry["original"]
            translation = entry["translation"]

            # 訳が空の場合はスキップ
            if translation is "":
                continue

            # キーのパターンチェック
            if match_key_compiled_pattern is not None:
                if match_key_compiled_pattern.search(key) is None:
                    continue

            # すでに訳が登録されており、それがさらに別の訳である場合、問題となる
            if original in mapping_db:
                if translation not in mapping_db[original]:
                    mapping_db[original].append(translation)

            # 訳が存在する場合は登録する
            else:
                mapping_db[original] = [translation]


def gen_map(target_dir_path,
            match_key_pattern=None):
    result = {}

    # Map生成
    for file in os.listdir(path=target_dir_path):
        load_map_from_file(
            file_path=os.path.join(target_dir_path, file),
            mapping_db=result,
            match_key_pattern=match_key_pattern
        )

    return result


def replace_text(src_text,
                 match_pattern,
                 translation_map={}):
    """
    対象のテキストを読み込んで、マッチする部分を変更する

    :param src_text:　対象のテキスト
    :param match_pattern: マッチパターン、(x)(target)(x)である必要がある
    :param translation_map: 翻訳マッピングオブジェクト key:[text1,text2,...]
    :return: 置換えされたテキストと個数のタプル
    """

    def repl(x):
        """
        置き換え関数
        :param x: グルーピングされたマッチオブジェクト
        :return: 置き換え後の文字列
        """
        text = x.group(2)
        if text in translation_map:
            lis = translation_map.get(text)
            if len(lis) > 1:
                print("複数候補あり、[0]で代用します {}".format(lis))
            text = lis[0]

        return x.group(1) + text + x.group(3)

    return re.sub(match_pattern, repl, src_text)


def u_write(file_path, text):
    """
    拡張子を変更して保存する
    :param file_path: ファイルパス
    :param text: 書き込み対象のテキスト
    :return: なし
    """

    dir_path = os.path.dirname(file_path)
    if not os.path.exists(dir_path):
        os.makedirs(dir_path)

    # 拡張子を変更する
    pair = os.path.splitext(file_path)

    # dir
    new_file_path = os.path.join(pair[0], pair[0] + ".utf8")

    with open(new_file_path, 'w', encoding='utf-8') as f:
        f.write(text)


def scan_files(src_path="C:\\Program Files (x86)\\Steam\steamapps\\common\\Europa Universalis IV\\",
               dst_path=os.getcwd(),
               target_list=[]):
    """
    デフォルトはEU4のインストールディレクトリを走査して、
    pythonが実行されているカレントディレクトリにdstフォルダを作って
    そこに変更が必要なファイルをutf-8で置いていきます
    それらのファイルは最終的にspecialEscapeで処理してください。

    :param src_path:  ソースのパス
    :param dst_path:　成果物のパス
    :return: なし
    """

    if not os.path.exists(src_path):
        raise Exception('srcがおかしい')

    if not os.path.exists(dst_path):
        raise Exception('dstがおかしい')

    for file_path in pathlib.Path(src_path).glob('**/*.txt'):
        # events/Tenguri.txtなどはコメントにUTF-8で書き込んでいるようで、テキストにCP1252には存在しない
        # 0x81などが発生してしまうのでignoreしている
        with open(str(file_path), 'r', encoding='windows-1252', errors='ignore') as f:
            src_text = dst_text = f.read()
            for target in target_list:
                dst_text = replace_text(src_text=src_text,
                                        match_pattern=target.match_pattern,
                                        translation_map=target.map)

            # 変更があったもののみを保存
            if dst_text != src_text:
                u_write(os.path.join(dst_path, "dst", str(file_path).replace(src_path, "")),
                        dst_text)


class Target(object):
    def __init__(self, ignore_list, match_pattern, map):
        self.ignore_list = ignore_list
        self.match_pattern = match_pattern
        self.map = map


if __name__ == '__main__':
    paratranz_folder_name = "2019_02_23_17_36_07"

    target_list = [
        Target(ignore_list="TBD",
               match_pattern=r'(has_ruler\s*=\s*")([^"]+)(")',
               map=gen_map(
                   target_dir_path=os.path.join(paratranz_folder_name, "raw\\history\\countries"),
                   match_key_pattern=r"monarch\|name"
               )),
        Target(ignore_list="TBD",
               match_pattern=r'(has_heir\s*=\s*")([^"]+)(")',
               map=gen_map(
                   target_dir_path=os.path.join(paratranz_folder_name, "raw\\history\\countries"),
                   match_key_pattern=r"heir\|name"
               )),
        Target(ignore_list="TBD",
               match_pattern=r'(has_leader\s*=\s*")([^"]+)(")',
               map=gen_map(
                   target_dir_path=os.path.join(paratranz_folder_name, "raw\\history\\countries"),
                   match_key_pattern=r"leader\|name"
               )),
        Target(ignore_list="TBD",
               match_pattern=r'(dynasty\s*=\s*")([^"]+)(")',
               map=gen_map(
                   target_dir_path=os.path.join(paratranz_folder_name, "raw\\history\\countries"),
                   match_key_pattern=r"monarch\|dynasty"
               ))
    ]

    scan_files(target_list=target_list)
