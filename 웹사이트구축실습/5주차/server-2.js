const http = require("http");

const server = http.createServer((req, res) => {
    console.log(req.method);

    res.setHeader("Content-Type", "text/plain");
    res.write("hello groomii");
    res.end();
});

server.listen(3000, () => {
    console.log("300번에서 http://localhost:3000");
});

