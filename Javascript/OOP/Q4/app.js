class Shape {
  constructor(name) {
    this.name = name;
  }

  calculatePerimeter() {
    return 0;
  }

  calculateArea() {
    return 0;
  }
}

class Circle extends Shape {
  constructor(name, radius) {
    super(name);
    this.radius = radius;
  }

  calculatePerimeter() {
    return 2 * 3.14 * this.radius;
  }

  calculateArea() {
    return 3.14 * this.radius ** 2;
  }

  displayCircleMeasurments() {
    const perimeter = this.calculatePerimeter().toFixed(2);
    const area = this.calculateArea().toFixed(2);
    console.log(`Perimeter of a Circle: ${perimeter}`);
    console.log(`Area of a Circle: ${area}`);
  }
}

class Square extends Shape {
  constructor(name, side) {
    super(name);
    this.side = side;
  }

  calculatePerimeter() {
    return 4 * this.side;
  }

  calculateArea() {
    return this.side ** 2;
  }

  displaySquareMeasurments() {
    const perimeter = this.calculatePerimeter();
    const area = this.calculateArea();
    console.log(`Perimeter of a Square: ${perimeter}`);
    console.log(`Area of a Square: ${area}`);
  }
}

class Triangle extends Shape {
  constructor(name, side1, side2, side3, base, height) {
    super(name);
    this.side1 = side1;
    this.side3 = side3;
    this.side2 = side2;
    this.base = base;
    this.height = height;
  }

  calculatePerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  calculateArea() {
    return (this.base * this.height) / 2;
  }

  displayTriangleMeasurments() {
    const perimeter = this.calculatePerimeter();
    const area = this.calculateArea();
    console.log(`Perimeter of a Triangle: ${perimeter}`);
    console.log(`Area of a Triangle: ${area}`);
  }
}

var fs = require("fs");
var input = fs.readFileSync("input.txt").toString().trim().split("\n");
var circle = new Circle(
  ...input[0]
    .split(",")
    .map((i) => (i = parseFloat(i) != NaN ? parseFloat(i) : i))
);
var square = new Square(
  ...input[1]
    .split(",")
    .map((i) => (i = parseFloat(i) != NaN ? parseFloat(i) : i))
);
var triangle = new Triangle(
  ...input[2]
    .split(",")
    .map((i) => (i = parseFloat(i) != NaN ? parseFloat(i) : i))
);

circle.displayCircleMeasurments();
square.displaySquareMeasurments();
triangle.displayTriangleMeasurments();
