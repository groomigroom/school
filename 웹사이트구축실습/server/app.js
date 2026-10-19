const express = require("express");
const dbConnect = require("./config/dbConnect");

const app = express();

dbConnect();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const router = express.Router();

app.get("/", (req, res) => {
    res.send("hello groooooooomi");
});

// app.get("/contents", (req, res) => {
//     res.send("go out");
// });

app.get("/gwajae", (req, res) => {
    res.send("gwajae!!!!!");
});

app.post("/contents", (req, res) => {
    res.send("create contacts page");
});




// app.get("/contents/:id", (req, res) => {
//     res.send(req.params.id);
// });

// app.put("/contents/:id", (req, res) => {
//     res.send(`update ${req.params.id}`);
// });

// app.delete("/contents/:id", (req, res) => {
//     res.send(`delete ${req.params.id}`);
// });




app.use("/users", require("./routes/contact_routers"));



app.listen(3000, () => {
    console.log("server started");
});

// mongodb + srv://googjohn0143_db_user:<db_password>@kimgroomi.ccwaao2.mongodb.net/
//kimgroomi

/*
제공해주신 연결 문자열(Connection String)은 MongoDB Atlas(클라우드 데이터베이스)의 주소입니다.
여기서 <db_password> 부분에는 Google 계정의 비밀번호를 넣는 것이 아니라, MongoDB Atlas 백엔드에서 생성한 '데이터베이스 사용자(Database User)'의 비밀번호를 넣으셔야 합니다. Google 소셜 로그인을 사용해 MongoDB Atlas에 가입하셨더라도, 데이터베이스 접속을 위한 별도의 비밀번호를 설정해야 합니다.
VS Code의 MongoDB 확장 프로그램에서 연결하는 방법은 다음과 같습니다.

1단계: MongoDB Atlas에서 비밀번호 확인 또는 재설정하기

Google 비밀번호를 입력하면 Authentication failed 오류가 발생하므로 아래 단계에 따라 데이터베이스 비밀번호를 설정하세요.
1. MongoDB Atlas 로그인 페이지로 이동하여 Google 계정으로 로그인합니다.
2. 왼쪽 메뉴의 Security 항목 아래에 있는 Database Access를 클릭합니다.
3. 목록에서 googjohn0143_db_user라는 사용자를 찾습니다.
4. 오른쪽에 있는 Edit 버튼을 누릅니다.
5. Password 항목에서 Edit Password를 누른 뒤, 사용할 새 비밀번호를 설정하거나 생성(Autogenerate)합니다. (비밀번호에 @, :, / 같은 특수문자가 포함되면 URL 인코딩이 필요하므로, 가급적 알파벳과 숫자 조합으로 만드는 것이 편리합니다.)
6. 하단의 Update User를 눌러 저장합니다.

2단계: VS Code에서 연결하기

1. VS Code를 열고 왼쪽 사이드바에서 MongoDB 아이콘을 클릭합니다.
2. Connections 메뉴 옆의 + (Add Connection) 아이콘을 클릭합니다.
3. 화면 상단에 입력창이 뜨면 Connect with Connection String을 선택합니다.
4. 주소창에 아래와 같이 <db_password> 자리에 방금 설정한 진짜 비밀번호를 넣어서 붙여넣습니다.mongodb+srv://googjohn0143_db_user:방금설정한비밀번호@kimgroomi.ccwaao2.mongodb.net/
5. 엔터(Enter)를 누르면 연결이 완료됩니다.
혹시 위의 방법대로 입력했는데도 연결이 안 되고 오류 메시지가 뜨나요? 그렇다면 어떤 에러 내용이 나오는지 알려주시면 문제를 해결해 드리겠습니다. (예: 네트워크 타임아웃, IP 화이트리스트 문제 등)

PS E:\황지원\ai웹사이트구축실습\server> npm i mongoose dotenv
*/