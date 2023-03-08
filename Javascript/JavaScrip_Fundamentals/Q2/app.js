var fs = require("fs");
var input = fs.readFileSync("input.txt").toString();

var temp = input.toLowerCase().replace(/\s/g, "");

const isPalindrome = (str) => {
  const reverse = str.split("").reverse().join("");
  return str === reverse;
};

if (isPalindrome(temp)) {
  console.log(`${input} is a palindrome`);
} else {
  console.log(`${input} is not a palindrome`);
}
