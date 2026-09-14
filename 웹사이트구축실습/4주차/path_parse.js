const path = require("path");

const parsedPath = path.parse(__filename);
console.log(parsedPath);

//경로를 객체로 만들기

/*
{
  root: 'E:\\',
  dir: 'E:\\황지원\\ai웹사이트구축실습\\server',
  base: 'path_parse.js',
  ext: '.js',
  name: 'path_parse'
}
*/
