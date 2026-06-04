// 1) literal object
// const obj = {
//     "Name" : "Jishan",
//     "Age" : 25, 
//     // sayhello : function(){
//     //     document.writeln("Hello "+ this.Name + "</br>");
//     // }
// }

// document.writeln(obj.Name+ " "+ obj["Age"] + "</br>");

// Adding the function 
// obj.sayhello = function(){
//         document.writeln("Hello "+ this.Name + "</br>");
//     }
// obj.sayhello();


// 2) new object
// const obj = new Object();
// obj.name = "marray";
// obj.Age = 20;

// document.writeln(obj.name + "</br>");

// 3) making class as the function 
// function it-self is a constructor
// function Employee(fn, ln){
//     this.fname = fn,
//     this.lname = ln
// };

// const emp = new Employee("Alex", "Walker");
// document.writeln(emp.name + "</br>");

// method added to the emp object only
// emp.fullname = function(){
//     document.writeln(this.fname +" "+ this.lname + "</br>");
// }
// emp.fullname();

// Adding method to the prototype or class or Function
// Employee.prototype.getName = function (){
//     document.writeln(this.fname + "</br>");
// }

// calling the prototype property is allowed
// Employee.prototype.age = 26;
// document.writeln(Employee.prototype.age + "</br>");

// calling the prototype method without createing the object is not allowed coz of this keyword
// Employee.prototype.getName(); 

// call prototype method by creating the object
// const emp1 = new Employee("Jamir", "sikalgar");
// emp1.getName();


// call apply and bind
// function Department(dn){
//     this.Deptname = dn;
// };

// let obj1 = {
//     fullname : function(Age, Gender){
//         document.writeln(this.Deptname + " "+ Age + " "+ Gender+ "</br>");
//     }
// }

// var dept = new Department("Hr");
// aisi method jo sab object ke liye common hai
// obj1.fullname.call(dept, 20);
// obj1.fullname.apply(dept, [20, "Male"]);
// let result = obj1.fullname.bind(dept, 30, "female");
// result();

// var x = 5 + "7"; // 57
// var x = "7" + 5;    // 75
// let a=10; let b = 20;
// ager pehle string hai and badme integer hai to string concat hoga
// document.writeln("Hello" + a + b); // hello1020 
// document.writeln("Hello" + (a + b)); // hello30

// ager pehle integer hai and badme string hai to pehle addition hoga then concat
// document.writeln(a + b + "Hello " + "</br>"); // 30hello

// let num1 = parseInt(prompt("Enter the num"));
// document.writeln(typeof(num1) + "</br>");

// let num2 = +prompt("Enter the num");
// document.writeln(typeof(num2) + "</br>");


// ---------------------------------- Inheritance(old style) ------------------------------------
// function Person(name) {
//     this.name = name; // now this = e1 (child object)
//     this.getname = function(){
//         return this.name;
//     }
// }

// Person.prototype.sayHello = function () {
//     console.log("Hello, from parent(person) method " + this.name);
// };


// function Employee(name, salary) {
//     Person.call(this, name); // this refer to current object Employee(Child) // same as java super keyword
//     // above line becomes as Person.call(e1, name);
//     this.salary = salary;
// }


// Employee.prototype = Object.create(Person.prototype);

// Employee.prototype.showSalary = function () { // Child own method
//     console.log("My salary is " + this.salary);
// };


// Employee.prototype.sayHello = function(){ // @override child override the parent(person) sayHello method
//     console.log("Hello from Child(Employee) method " + this.name)
// }

// Using it
// var e1 = new Employee("Jishan", 50000);
// e1.sayHello();     // Inherited from Person
// e1.showSalary();   // Own method
// console.log(e1.getname());
// Explanation of above code
// When you call:
// var e1 = new Employee("Jishan", 50000);

// A new Employee object is created.

// Inside Employee constructor:

// Person.call(this, name);

// Here:

// this = Employee object e1

// So JavaScript executes:

// Person.call(e1, name);

// ----------------------------------------- End -------------------------------------------------