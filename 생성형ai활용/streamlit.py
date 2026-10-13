import streamlit as st
import pandas as pd

st.title("이건 타이틀")
st.write("김구름이")
st.header("헤더 구름이 헤더 :sparkles:")
st.subheader("이건 subheader다.")
st.caption("구름이의 캡션")

code = '''
public static void main(String[] args) {
    System.out.println("김구름 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍 멍멍멍");
}
'''
st.code(code, language="java")


#https://docs.streamlit.io/develop/api-reference/text/st.latex

st.latex(r'''
    김구름 + 김구름멍멍 + 김구름이 멍멍^g + 멍멍이 김구름^3 + \cdots + a r^{구름구름-1} =
    \sum_{k=0}^{김구름-1} ar^k =
    a \left(\frac{1-r^{n}}{1-r}\right)
    ''')


st.title("데이터 프레임")
dataframe = pd.DataFrame({
    "구름이1": [1, 3, 4, 5],
    "구름이2": [2, 3, 4, 5]
})

st.dataframe(dataframe, use_container_width=False)
st.dataframe(dataframe, use_container_width=True)
st.table(dataframe)

st.metric(label="구름이의 온도", value="22도", delta="12도")
st.metric(label="구름이집 주가??", value=";D", delta="20000000000000000000000000000000000000000000000000000")
