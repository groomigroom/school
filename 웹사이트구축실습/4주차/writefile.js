const fs = require("fs");

const data = fs.readFileSync("example.txt", "utf8");
fs.writeFileSync("text1.txt", data);
