const path = require("path");

console.log(`파일 절대 경로: ${__filename}`);
//파일 절대 경로: E:\황지원\ai웹사이트구축실습\server\path.js

const dir = path.dirname(__filename);
console.log(`경로만: ${dir}`);
//경로만: E:\황지원\ai웹사이트구축실습\server

// const ext = path.extname(__filename);
// //확장자 이름
// console.log(`파일 확장자: ${ext}`);
// console.log(path.basename(__filename.ext));
