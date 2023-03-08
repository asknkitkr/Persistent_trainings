class Person {
  constructor(id, name) {
    this.id = id;
    this.name = name;
  }

  displayData() {
    console.log("Name = " + this.name + ", ID = " + this.id);
  }
}

let p1 = new Person(111, "Ankit");
console.log(p1.displayData());

document.write("NAME = " + p1.name + "<br>" + "ID = " + p1.id);
