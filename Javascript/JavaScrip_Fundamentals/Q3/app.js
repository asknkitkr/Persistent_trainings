var fs = require("fs");
var input = fs.readFileSync("input.txt").toString().trim();

const factorial = (num) => {
  if (num === 0 || num === 1) {
    return 1;
  } else {
    return num * factorial(num - 1);
  }
};

const result = factorial(parseInt(input));
console.log(result);
