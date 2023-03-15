var fs = require("fs");
var input = fs.readFileSync("input.txt").toString();

function User(name) {
  this.name = name;
}

Object.defineProperty(User.prototype, "name", {
  get: function () {
    return this._name;
  },
  set: function (name) {
    this._name = name;
  },
});

User.prototype.checkNameLength = function () {
  if (this.name.length > 4) {
    console.log(this.name);
  } else {
    console.log("Name is too short");
  }
};

var user = new User(input);
user.checkNameLength();
