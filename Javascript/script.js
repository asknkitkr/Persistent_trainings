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

class Employee {
  #empid;
  #empname;

  constructor(id, name) {
    this.#empid = id;
    this.#empname = name;
  }

  get getEmpName() {
    return this.#empname;
  }

  set setEname(ename) {
    this.#empname = ename;
  }
}

let e1 = new Employee(101, "Ankit");
document.write("Name:" + e1.getEmpName);
