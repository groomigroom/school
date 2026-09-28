#---------------------------------------------------------------------------------------------------


import csv
f = open('data/characters22.csv', 'r', encoding='cp949')
# f = open('data/characters22.csv', 'r', encoding='cp949', newline="")

rdr = csv.reader(f)
# rdr = csv.writer(f)

#rdr.writerow(['6', '김구름이', '흰색', '간식먹기', '곰돌이'])

for line in rdr:
    print(line)

f.close()


#---------------------------------------------------------------------------------------------------

import pandas as pd
groomi_friends = ["김구름", "이새싹", "박방울", "황참이"]
series_friends = pd.Series(groomi_friends)
series_friends

"""
0
0	김구름
1	이새싹
2	박방울
3	황참이
"""


#---------------------------------------------------------------------------------------------------


with open("groomi.txt", "a") as f:
    f.write("kimgroomgroom")

with open("groomi.txt", "r") as f2:
    data = f2.read()
    print(data)

with open('data/characters22.csv', 'a', encoding='cp949', newline='') as f:
    wr = csv.writer(f)
    
    wr.writerow(['030993920', '김김구름이', '흰색', '간식먹기', '곰돌이'])


#---------------------------------------------------------------------------------------------------

#파일 읽기 쓰기 등등
f = open("groomi.txt", "w")
f.write("kimgroomi mungmung\n")
f.write("kimgroomi mungmungg\n")
f.close()
f2 = open("groomi.txt", "r")
data = f2.read()
data2 = f2.readlines()
print(data)
for line in data2:
    print(line)
f2.close


#---------------------------------------------------------------------------------------------------

import seaborn
var = ["a", "a", "b", "c"]
seaborn.countplot(x = var)
#배열에서 수로 그래프 그려주는거

#---------------------------------------------------------------------------------------------------


import seaborn as sb
df = sb.load_dataset("titanic")
sb.countplot(data = df, x = "pclass")


#---------------------------------------------------------------------------------------------------


