const fs = require("fs");

const data = fs.readFileSync("example.txt", "utf8");
fs.writeFileSync("text1.txt", data);
//파일 생성됨

if (fs.existsSync("text1.txt")) {
    console.log("file already exist");
} else {

}
