const fs = require("fs");

//const data = fs.readFileSync("example.txt", "utf8");
// fs.writeFileSync("text1.txt", data);
//파일 생성됨

const data = fs.readFileSync("example.txt", "utf8", (err, data) => {
    if (err) {
        console.log(err);
    }

});

fs.writeFile("./text2.txt", data, (err) => {
    if (err) {
        console.log(err);
    }
    console.log("text2.txt is saved!");
});

/*
if (fs.existsSync("text1.txt")) {
    console.log("file already exist");
} else {

}
*/
