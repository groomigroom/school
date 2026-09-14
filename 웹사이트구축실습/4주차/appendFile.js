const fs = require("fs");

fs.appendFile("./text4.txt", "\n\n새로운 내용 추가하기!!!!!", (err) => {
    if (err) {
        console.log(err);
    }
    console.log("끝");
});
