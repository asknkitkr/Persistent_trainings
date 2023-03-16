var fs = require("fs");
var data = fs.readFileSync("input.txt").toString().trim().split("\n");

const { isPrime } = require("./display");
const n = Number(data);

console.log(isPrime(n));
