
// 1. globally
// var age = 20;
// document.writeln(age);

// 2. inside the function 
// function func(){
//     var x = 10; // now it becomes the local scope
//     document.writeln("inside func : " + x);
// }
// document.writeln(x);
// func();

// 3. inside the block if, for, {}
// if(true){
//     var xyz = 10;
// }
// document.write(xyz);

// 4. inside block without var
// if(true){
//     age = 50;
// }

// or

// function func(){
//     x = 10; 
//     document.writeln("inside func : " + x);
// }

// document.writeln(x);

// document.writeln(abc);
// var abc = 20;


// document.writeln(xyz);
// const xyz = 50;

// let arr = [10, 20,50];
// let newarr = [30,...arr, 40];
// for(let num of newarr){
//     document.writeln(num);
// }

// function func(a, b, c){
//     document.writeln(a + " " + b + " " + c );
// }

// func(...arr);

// (function () {
//     document.writeln("Hello");
// })();

// let r = (a) => {return a * a};

// let x = (b)=> b * b * b;
// document.writeln( x(5) );

// const array1 = [1, 4, 9, 16];
// const map1 = array1.map(x => x * 2);
// document.writeln(map1);

function Student(n, a){
    this.name = n;
    this.Age = a;
}

var st = new Student("Jishan", 25);
var st2 = new Student("Moin", 30);

Student.prototype.sayhello = function (){
    document.writeln("Hello "+this.name + "</br>");
}

st.sayhello();
st2.sayhello(); 
st.nationality = "indian";

document.writeln(st.nationality + "</br>");
// st.details = function(){
//     document.writeln(this.name + " " + this.Age+ "</br>");
// }

// st.details();

// Another way to access the object properties or class members
// document.writeln(st.name + "</br>"); // 1 sta way
// document.writeln(st["name"] + "</br>"); // 2nd way






