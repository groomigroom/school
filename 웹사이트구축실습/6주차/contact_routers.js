const express = require("express");
const router = express.Router();


router.route("/contacts").get((req, res) => {
    res.send("go out");
}).post((req, res) => {
    console.log(req.body);
    const { username, email } = req.body;
    if (!username || !email) {
        return res.send("필수값 입력 안 됨");
    }

});

router.route("/contents/:id").put(
    (req, res) => {
        res.send(`update ${req.params.id}`);
    }
).get(
    (req, res) => {
        res.send(req.params.id);
    }
).delete((req, res) => {
    res.send(`delete ${req.params.id}`);
});

module.exports = router;
