import numpy as np
import matplotlib.pyplot as plt
from tensorflow.keras.datasets import reuters
from tensorflow.keras.preprocessing.text import Tokenizer
from tensorflow.keras.utils import to_categorical
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dropout, Dense

# ==========================================
# 1. 데이터셋 로드 및 전처리 (이전 단계)
# ==========================================
max_words = 10000
num_classes = 46

(train_data, train_labels), (test_data, test_labels) = reuters.load_data(num_words=max_words)

tokenizer = Tokenizer(num_words=max_words)
x_train = tokenizer.sequences_to_matrix(train_data, mode='binary')
x_test = tokenizer.sequences_to_matrix(test_data, mode='binary')

y_train = to_categorical(train_labels, num_classes=num_classes)
y_test = to_categorical(test_labels, num_classes=num_classes)


# ==========================================
# 2. 모델 아키텍처 정의 (질문자님 코드)
# ==========================================
model = Sequential()
model.add(Dense(256, input_shape=(max_words,), activation='relu'))
model.add(Dropout(0.5))
model.add(Dense(128, activation='relu'))
model.add(Dropout(0.5))
model.add(Dense(num_classes, activation='softmax'))


# ==========================================
# 3. 모델 컴파일 (★이 단계가 누락되어 에러가 났었습니다)
# ==========================================
model.compile(
    optimizer='adam',
    loss='categorical_crossentropy', # y_train이 원-핫 인코딩 상태이므로 이 손실함수를 씁니다
    metrics=['accuracy']
)


# ==========================================
# 4. 모델 학습 진행 및 시각화
# ==========================================
# 학습 실행
history = model.fit(
    x_train, y_train,
    epochs=20,
    batch_size=128,
    validation_split=0.2
)

# 그래프 시각화
plt.figure(figsize=(12, 4))

plt.subplot(1, 2, 1)
plt.plot(history.history['loss'], label='Train Loss', color='blue')
plt.plot(history.history['val_loss'], label='Validation Loss', color='red', linestyle='--')
plt.title('Loss Trajectory')
plt.xlabel('Epochs')
plt.ylabel('Loss')
plt.legend()
plt.grid(True)

plt.subplot(1, 2, 2)
plt.plot(history.history['accuracy'], label='Train Accuracy', color='blue')
plt.plot(history.history['val_accuracy'], label='Validation Accuracy', color='red', linestyle='--')
plt.title('Accuracy Trajectory')
plt.xlabel('Epochs')
plt.ylabel('Accuracy')
plt.legend()
plt.grid(True)

plt.tight_layout()
plt.show()
