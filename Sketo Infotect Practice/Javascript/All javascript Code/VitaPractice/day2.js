// ---------------------- closures -----------------------------
// let myfunc = function(){
//                     let counter = 0;
//                     return function(){
//                                 return ++counter;
//                            }
//              }
// // document.writeln(myfunc()() + "</br>");  // if you want to call the directly // here myfunc() calls the outer function and () calls the inner function
// // document.writeln(myfunc()() + "</br>");  // if you want to call the directly
// let fun = myfunc();
// document.writeln(fun() + "</br>"); 
// document.writeln(fun() + "</br>");

// ----------------------------- class and object --------------------------------------
// class Demo {
//     constructor(n, a, fn) {
//         this.name = n;
//         this.age = a;
//         this.FirstName = fn;
//     };

//     sayhello() {
//         document.writeln("Hello from SayHello" + "</br>");
//     }

//     set FirstName(value){
//         this.fn = value;
//     }

//     get FirstName(){
//         return this.fn;
//     }

// }
// var obj = new Demo("Jishan", 20, "Peter parker");

// console.log(new Demo("Jishan", 20, "Peter parker"));
// document.writeln(new Demo() + "</br>");
// console.log(obj);
// console.log(Demo.prototype);

// --------------------------------- Anonymous class ---------------------
// let foo = class{
//     sayHello(){
//         document.writeln("variable" + "</br>");
//     }
// }
// var info = new foo();
// info.sayHello();
// or
// new foo().sayHello();

// function returning the anonymous class
// let foo = function(na){
//             return class{
//                 sayhello(){
//                     document.writeln(na + "</br>");
//                 }
//             }
// } 

// var d = foo("Jishan");
// new d().sayhello();

// -------------------- Private method and static method
// class ClassWithPrivateMethod {

//     #privateMethod() {
//         return 'hello world'
//     }

//     getPrivateMessage() {
//         return this.#privateMethod()
//     }
// }
// const instance = new ClassWithPrivateMethod()
// console.log(instance.getPrivateMessage())

// class ClassWithPrivateStaticField {
//     static #PRIVATE_STATIC_FIELD
//     static publicStaticMethod() {
//         ClassWithPrivateStaticField.#PRIVATE_STATIC_FIELD = 42
//         return ClassWithPrivateStaticField.#PRIVATE_STATIC_FIELD
//     }
// }

// console.log(ClassWithPrivateStaticField.publicStaticMethod() === 42)

// class ClassWithPrivateStaticMethod {
//     static #privateStaticMethod() {
//         return 42
//     }
//     static publicStaticMethod1() {
//         return ClassWithPrivateStaticMethod.#privateStaticMethod();
//     }
// }

// console.log(ClassWithPrivateStaticMethod.publicStaticMethod1() === 42);

// class Base {

//     static #privateStaticMethod() {
//         return 42;
//     }
//     static publicStaticMethod1() {
//         return Base.#privateStaticMethod();
//     }
//     static publicStaticMethod2() {
//         return this.#privateStaticMethod();
//     }
// }

// // iss program me child class ka object se method call kar rahe hai to this me child object hoga and wo method child me nhai hai isliye 
// // error dega
// class Derived extends Base { }
// console.log(Derived.publicStaticMethod1());// 42
// console.log(Derived.publicStaticMethod2());// TypeError


// ----------------------- Optional chaining ------------------------
// no error
// let user; // user has no address
// alert(user?.address); //undefine
// document.write("Flow will go ahead");

// no error
// let user = null;
// alert(user?.address);
// document.write("flow will go ahead");

// this will give error
// alert(user?.address);
// document.write("err")

// error
// let user = {};
// alert(user?.address.street);
// document.write("Err")

// let x = (1 && 2) ?? 3; // Works
// alert(x); 

// ----------------------------- Array Destructing --------------------
// let arr = [10, 20, 30];
// let [a, b, c] = arr
// console.log(a);
// console.log(b);
// console.log(c);

// or

// let [a, b, c] = [10, 20, 30];
// console.log(a);
// console.log(b);
// console.log(c);

// Skip values
// let [a, , c] = [10, 20, 30];
// console.log(a); // 10
// console.log(c); // 30

// Default values
// let [a = 1, b = 2] = [10];
// console.log(a); // 10
// console.log(b); // 2

// Swap values (popular interview trick)
// let x = 5, y = 10;
// // let [x, y] = [y, x]; // give error coz x and y is already defined and let variable can not be redeclared
// console.log(x, y); // 10 5

// // Destructure inside functions
// function print([a, b]) {
//     console.log(a, b);
// }
// print([10, 20]);

// used in for of loop
// for (var [key, value] of myMap) {
//     console.log(key + "=" + value);
// }


// ----------------------- Object Destructoring
// let options = {
//     title: "Menu",
//     width: 100,
//     height: 200
// };

// // order not matched
// let { name, width, height } = options;
// alert(title); // Menu
// alert(width); // 100
// alert(height); // 200


