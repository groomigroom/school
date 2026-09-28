const express = require("express");

const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const router = express.Router();

app.get("/", (req, res) => {
    res.send("hello groooooooomi");
});

// app.get("/contents", (req, res) => {
//     res.send("go out");
// });

app.get("/gwajae", (req, res) => {
    res.send("gwajae!!!!!");
});

app.post("/contents", (req, res) => {
    res.send("create contacts page");
});




// app.get("/contents/:id", (req, res) => {
//     res.send(req.params.id);
// });

// app.put("/contents/:id", (req, res) => {
//     res.send(`update ${req.params.id}`);
// });

// app.delete("/contents/:id", (req, res) => {
//     res.send(`delete ${req.params.id}`);
// });




app.use("/users", require("./routes/contact_routers"));



app.listen(3000, () => {
    console.log("server started");
});
