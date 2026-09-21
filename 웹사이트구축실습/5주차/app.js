const express = require("express");

const app = express();

app.get("/", (req, res)=> {
    res.send("hello groooooooomi");
});

app.get("/contents", (req, res)=> {
    res.send("go out");
});

app.get("/gwajae", (req, res)=> {
    res.send("gwajae!!!!!");
});

app.listen(3000, () => {
  console.log("server started");
});
