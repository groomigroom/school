const groomi = require('./user');
const hello = require('./hello');
const userss = require('./web_2');
const user4s = require("./user4");

const { user1, user2 } = require('./web_2');

console.log(user4s);
//{ user1: 'kimgroom', user2: '김구름', user3: '김구름이' }

hello(groomi);
hello(userss.user1);
hello(userss.user2);
hello(userss.user3);
hello(user1);
hello(user2);
hello(user4s.user1);
hello(user4s.user2);
hello(user4s.user3);
