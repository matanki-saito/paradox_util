from PIL import Image
import glob
from functools import reduce
from subprocess import run


def image_concat(im1, im2):
    dst = Image.new('RGBA', (im1.width + im2.width, im1.height), (0, 0, 0, 0))
    dst.paste(im1, (0, 0))
    dst.paste(im2, (im1.width, 0))
    return dst


def main():
    # 列挙
    image_stack = []
    for f in glob.glob('../resource/体/*.png'):
        img = Image.open(f)

        # 上下にマージンを追加する
        im_crop_outside = img.crop((0, -40, 400, 360))

        # このサイズがck2のデフォルト
        im_resize = im_crop_outside.resize((152,152))

        img.close()

        # 追加
        image_stack.append(im_resize)

    concat_image = reduce(image_concat, image_stack)

    # ファイルセーブ
    concat_image.save('../concatBase1.png')

    # ddsに変換（外部プログラム使用）
    run(['../nvcompress/nvcompress.exe',
         '-rgb',
         '../concatBase1.png',
         '../concatBase1.dds'])


if __name__ == '__main__':
    main()


