from PIL import Image
import csv

emmin = 2000

target = [
    "Eientei",
    "Bamboo Forest",
    "Myouren Temple",
    "Cemetary",
    "Mausoleum",
    "Spirits Palace",
    "Ancient City",
    "Former Hell",
    "Higan",
    "Tengu Mountain",
    "Great Youkai Forest",
    "Moriya Shrine",
    "Uchouten",
    "Kappa Valley",
    "Hakugyokurou",
    "Netherworld",
    "Scarlet Devil Mansion",
    "Prismriver",
    "Misty Lake",
    "East Forest",
    "Central Forest",
    "South Forest",
    "West Forest",
    "North Forest",
    "Illusion Field",
    "Eastern Mountains",
    "Mansionsite",
    "Hakurei Shrine",
    "Sunny Field",
    "Nameless Hill",
    "Human Village",
    "Village School",
    "Forest Border"
]

# 参考にした
# https://seesaawiki.jp/samplepython/d/PIL%A4%C7%A4%CE%A5%D4%A5%AF%A5%BB%A5%EB%C3%B1%B0%CC%A4%C7%A4%CE%C1%E0%BA%EE

definitionMapOld = {}
with open('old/definition.csv', 'r', encoding="windows-1252") as csvfile:
    reader = csv.reader(csvfile, delimiter=';', quotechar='|')
    header = next(reader)
    for row in reader:
        if row == [] or row[0] is '':
            continue;

        code= int(row[0])
        R = int(row[1])
        G = int(row[2])
        B= int(row[3])
        tag = row[4]

        if tag in target:
            definitionMapOld[tag] = (R,G,B,code)
            emmin = max(emmin,code)

definitionNewEmptyStack = []
with open('new/definition.csv', 'r', encoding="windows-1252") as csvfile:
    reader = csv.reader(csvfile, delimiter=';', quotechar='|')
    header = next(reader)
    for row in reader:
        if row == [] or row[0] is '':
            continue;

        code= int(row[0])
        R = int(row[1])
        G = int(row[2])
        B= int(row[3])
        tag = row[4]

        # 空きを探す
        if tag is '' and  code > emmin:
            definitionNewEmptyStack.append((R,G,B,code))

# 変換テーブル作る。空きの中から選ぶ
henkantable = {}
henkan =[]
for key,item in definitionMapOld.items():
    em=definitionNewEmptyStack.pop(0)
    henkantable[item[0:3]] = em[0:3]

    henkan.append(str(em[3])+";" + ';'.join(map(str,em[0:3])) + ";" + key + ";x")

print("\n".join(henkan))

# 幻想郷がある範囲だけ処理　x:390 - 670,　y: 230 - 460
img = Image.open('provinces.bmp', 'r')

for pixY in range(230, 460):
    for pixX in range(390, 670):
        rgb = img.getpixel ( (pixX,pixY) )
        if rgb in henkantable:
            img.putpixel(  (pixX,pixY) , henkantable[rgb] )

img.save('repaint_img.bmp', 'bmp', quality=100, optimize=False)

img.close()
