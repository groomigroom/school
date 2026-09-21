const http = require("http");

const server = http.createServer((req, res) => {
    const { url, method } = req;
    res.setHeader("Content-Type", "text/plain");
    if (method === "GET" && url === "/home") {
        res.statusCode = 200;
        res.end("HOME");
    } else if (method === "GET" && url === "/about") {
        res.statusCode = 200;
        res.end("ABOUT");
    } else {
        res.statusCode = 404;
        res.end("go out");
    }
});

server.listen(3000, () => {
    console.log("300번에서 http://localhost:3000");
});
