const http = require("http");
const fs = require("fs");

const server = http.createServer((req, res) => {
    res.setHeader("Content-Type", "text/html");
    const readStream = fs.createReadStream(__dirname + "/index.html", "utf8");
    readStream.pipe(res);
});

server.listen(3000, () => {
    console.log("300번에서 http://localhost:3000");
});
