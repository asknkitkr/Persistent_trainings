function Employee(name, dept, doj) {
  this.name = name;
  this.dept = dept;
  this.doj = doj;

  this.display = function () {
    console.log("Name : " + this.name);
    console.log("Department : " + this.dept);
    console.log("DOJ : " + this.doj);
  };
}

var fs = require("fs");
var input = fs.readFileSync("input.txt").toString().trim().split("\n");

var employee = new Employee(input[0], input[1], input[2]);
employee.display();
