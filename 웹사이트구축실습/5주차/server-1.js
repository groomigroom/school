const http = require("http");

const server = http.createServer((req, res) => {
    console.log("요청");
});

server.listen(3000, () => {
    console.log("300번에서 http://localhost:3000");
});
