const fs = require("fs");
// let files = fs.readFileSync("example.txt", "utf8");
// console.log(files);

//<Buffer ea b5 ac eb a6 84 ec 9d b4 20 eb a9 8d eb a9 8d 31 31 31 31 31 31 31 31 31 31 31 31 31 31 31 31 31 31 31 3131 31 31>
//바이너리 코드를 보여줌.

//구름이 멍멍11111111111111111111111 -> utf8쓰니까

fs.readFile("example.txt", "utf8", (err, data) => {
    if (err) {
        console.error(err);
    }
    console.log(data);
});

//구름이 멍멍11111111111111111111111
