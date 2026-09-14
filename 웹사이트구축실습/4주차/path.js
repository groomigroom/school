const path = require("path");

console.log(`파일 절대 경로: ${__filename}`);

const dir = path.dirname(__filename);
console.log(`경로만: ${dir}`);

const fn = path.basename(__filename);
const fn2 = path.basename(__filename, ".js");
console.log(`파일 이름 : ${fn}`);
console.log(`파일 이름 확장자 제외 : ${fn2}`);

// const ext = path.extname(__filename);
// //확장자 이름
// console.log(`파일 확장자: ${ext}`);
// console.log(path.basename(__filename.ext));
//파일 이름만 추출하는게 basename
