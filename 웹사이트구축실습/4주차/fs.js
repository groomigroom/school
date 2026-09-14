const fs = require("fs");

// fs.readFile("example.txt", (err, data) => {
//     console.log(data);
// });


비동기
fs.readdir("./", (err, files) => {
    if (err) {
        console.error(err);
    }
    console.log(files);
});

/*
[
  '1',             'example.txt',
  'fs.js',         'function.js',
  'greeting.js',   'hello.js',
  'hello_1.js',    'httpServer.js',
  'node_modules',  'package-lock.json',
  'package.json',  'path.js',
  'path_parse.js', 'user.js',
  'user4.js',      'web_2.js'
]
*/
