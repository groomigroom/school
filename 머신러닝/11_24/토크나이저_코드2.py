from tensorflow.keras.preprocessing.text import Tokenizer
from tensorflow.keras.preprocessing.sequence import pad_sequences

tokenizer = Tokenizer()
train_text = "김구름 귀여운 멍멍이 깜찍한 산뜻한 날라다니는 맨날 노는"

# 단어 집합 생성
tokenizer.fit_on_texts([train_text])

# 정수 인코딩
sub_text = "김구름 귀여운 멍멍이 산뜻한 강아지"
sequences = tokenizer.texts_to_sequences([sub_text])[0]

print("정수 인코딩 : ",sequences)
print("단어 집합 : ",tokenizer.word_index)

"""
정수 인코딩 :  [1, 2, 3, 5]
단어 집합 :  {'김구름': 1, '귀여운': 2, '멍멍이': 3, '깜찍한': 4, '산뜻한': 5, '날라다니는': 6, '맨날': 7, '노는': 8}
"""
