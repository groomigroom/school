from tensorflow.keras.preprocessing.text import Tokenizer
from tensorflow.keras.preprocessing.sequence import pad_sequences

tokenizer = Tokenizer()
train_text = "kim goo rem is cute on the world"

# 단어 집합 생성
tokenizer.fit_on_texts([train_text])

# 정수 인코딩
sub_text = "The earth is an great place live"
sequences = tokenizer.texts_to_sequences([sub_text])[0]

print("정수 인코딩 : ",sequences)
print("단어 집합 : ",tokenizer.word_index)

"""
정수 인코딩 :  [7, 4]
단어 집합 :  {'kim': 1, 'goo': 2, 'rem': 3, 'is': 4, 'cute': 5, 'on': 6, 'the': 7, 'world': 8}
"""
