<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>스크립트</title>
    <style>
        .script_show3 {
            width: 100px;
            height: 100px;
        }

        .script_show3.on {
            animation: script_show3 3s ease 0s infinite;
        }

        @keyframes script_show3 {
            0% {
                transform: rotateZ(0deg);
            }
            100% {
                transform: rotateZ(360deg);
            }
        }
    </style>
</head>
<body>
<a href="javascript:alert('김구름이 멍멍')">ㅇㅇ</a>
<p class="script_show"></p>
<p class="script_show2"></p>
<div class="script_show3" ondblclick="script_show33()">돌리기</div>
<div class="script_show4" onmouseover="script_function44()" onmouseout="function5()">글자 내용 바꾸기</div>
<div class="script_show5" onclick="fun6()">글자 내용 바꾸기</div>
<div class="teul6" onclick="fun7()">경고</div>
<script>
    let html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag = "span_is_not_block_hr_은 수평선<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "span 태그는 인라인입니다....<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "<!--->가 주석입니다.<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "앞에 지정한 글꼴이 있으면 쓰고 없으면 못쓰고....<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "콘텐츠, 패딩, 테두리, 여백 순으로 되는거<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "display block  inline 등등<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "시맨틱 태그를 사용하는 목적은 웹 검색 쉽게 하기 위해서<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "<br>";
    html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag += "<br>";
    let script_show = document.querySelector(".script_show");
    script_show.innerHTML = html_css_js_is_on_web_site_doctype_html_span_is_not_block_tag;
    let str2 = "인라인으로 배치되면서 width와 height로 크기를 지정 가능함. 이게 inline block<br>";
    str2 += "text-shadow가 글자에 그림자 효과를 주는거<br>";
    str2 += "귀찮으니까 점수는 안본다.... 굳이 점수를 봐야되나....<br>";
    str2 += "에디터를 열어 주셔야죠.../././ <br>";
    str2 += "<span style='color: aquamarine'>자바스크립트는 모션을 만듦</span>넷스케이프 사에서<br>";
    str2 += "개발된 자바스크립트<br>";
    str2 += "틀 자체가 c 언어를 기본으로 함.<br>";
    str2 += "html에다가 코드를 때려 넣어서 확인 함<br>";
    str2 += "html 태그 안에다가 이벤트 리스너 속성에 작성<br>";
    str2 += "스크립트 태그에 작성<br>";
    str2 += "자바 스크립트 파일에 작성<br>";
    str2 += "a 태그의 href 속성에 작성하기..././././<br>";
    let num1 = 1;
    num1 += 1;
    str2 += num1 + "<br>";
    str2 += "이벤트 리스너 html 코드는 onclick 이런식<br>";
    str2 += "onclick=\"this.src=\"groomi.jpg\"<br>";
    str2 += "ondblclick은 더블 클릭임.<br>";
    str2 += "onmouseover 및 onmouseout도 있음.<br>";
    str2 += "<br>";
    str2 += "<br>";
    str2 += "<br>";
    let script_show2 = document.querySelector(".script_show2");
    script_show2.innerHTML = str2;

    function script_show33() {
        document.querySelector(".script_show3").classList.add("on");
    }

    function script_function44() {
        document.querySelector(".script_show4").innerHTML = "김구름이";
    }

    function function5() {
        document.querySelector(".script_show4").innerHTML = "구름이";
    }

    let numnum = 1;
    numnum *= 100;
    numnum += 101;

    setInterval(() => {
        numnum += 1;
    }, 1000);

    function fun6() {
        setInterval(() => {
            numnum += 1;
            document.querySelector(".script_show5").innerHTML = numnum;
        }, 1000);
    }

    function fun7() {
        for (let i = 0; i < 20; i++) {
            alert("김구름이");
            let name = prompt("이름 입력하기");
            if (name) {
                alert(name + "님 입금 부탁드립니다.");
            } else {
                alert("나가세요");
            }
            alert("계좌 번호를 보내드릴까요?");
        }
    }
</script>
</body>
</html>
