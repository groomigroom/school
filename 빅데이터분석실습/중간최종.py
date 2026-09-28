function solution(num_list) {
    let answer = [];
    for (let i = 0; i < num_list.length; i++) {
        answer.push(num_list[i]);
    }
    if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
        
    }
    return answer;
}


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


