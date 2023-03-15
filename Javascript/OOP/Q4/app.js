class Shape {
  constructor(name) {
    this.name = name;
  }

  calculatePerimeter() {
    console.log(`Perimeter of a ${this.name}: `);
  }

  calculateArea() {
    console.log(`Area of a ${this.name}: `);
  }
}

class Circle extends Shape {
  constructor(name, radius) {
    super(name);
    this.radius = radius;
  }

  displayCircleMeasurments() {
    super.calculatePerimeter();
    console.log((2 * 3.14 * this.radius).toFixed(2));
    super.calculateArea();
    console.log((3.14 * this.radius * this.radius).toFixed(2));
  }
}

class Square extends Shape {
  constructor(name, side) {
    super(name);
    this.side = side;
  }

  displaySquareMeasurments() {
    super.calculatePerimeter();
    console.log(4 * this.side);
    super.calculateArea();
    console.log(this.side * this.side);
  }
}

class Triangle extends Shape {
  constructor(name, side1, side2, side3, side4, base, height) {
    super(name);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.side4 = side4;
    this.base = base;
    this.height = height;
  }

  displayTriangleMeasurments() {
    super.calculatePerimeter();
    console.log(1 * (this.side1 + this.side2 + this.side3 + this.side4));
    super.calculateArea();
    console.log(((this.base * this.height) / 2).toFixed(2));
  }
}

var fs = require("fs");
var input = fs.readFileSync("input.txt").trim().split("\n");

var circle = new Circle(...input[0].split(","));
var square = new Square(...input[1].split(","));
var triangle = new Triangle(...input[2].split(","));

circle.displayCircleMeasurments();
square.displaySquareMeasurments();
triangle.displayTriangleMeasurments();
