const fs = require("fs");

let content = `
    구름이 멍멍멍
`;

fs.writeFileSync("text3.txt", content, { flag: "a" });
