#11월 10일 과제20
groomiiscute = """
dense가 전체가 다 연결된 이유??
편향의 행렬의 의미?
편향 행렬의 크기를 구하는 것의 의미?
은닉층과 출력층?
코드의 의미가 코드의 내용보다 중요한 이유?

from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense

model = Sequential()

# 4개의 입력과 8개의 출력
model.add(Dense(8, input_dim=4, activation='relu'))

# 이어서 8개의 출력
model.add(Dense(8, activation='relu'))

# 이어서 3개의 출력
model.add(Dense(3, activation='softmax'))

위 코드의 입출력을 그림으로 그리시오
원핫백터란? #확률상 맞는거 빼고 다 없애버리는거?
"""
print(groomiiscute)
