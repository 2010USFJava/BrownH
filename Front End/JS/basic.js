//JavaScript is not related to Java
//not compiled- interpreted
//JavaScript is a prototype based, multi-paradigm,
//single threaded, dynamic language,
//supporting object oriented, imperative,
//and declarative (e.g. functional programming)
//styles.

//JS is also loosely-typed
//variable types are asigned at runtime 

var a=10;
console.log(a);
a="chaos";
console.log(a);
/*Datatypes
6 data types that are primitive, checked the type of operator
-undefined
-boolean
    true and false
    truthy and falsy
    -truthy
        -true 
        -1
        -object
    -falsy
        -o
        --0
        -undefined
        -null
        -false
        -"" empty string no spaces
        -Nan
-number
-String
-ES6
    -BigInt
    -Symbol

Not primities
null - typeof is object
object - typeof is object
function - non data structure, typeof is function
Nan - "not a number" typeof is number
*/
var b,c,d,e,f,g,h,e;
b="10";
c=true;
d={}; //object use curly braces to denote an object
e=null;
g=(0/0);
h=[]; //array typeof object 
i=function(){};
//f is UNDERdefines
//z is not defined 
//type coercion 
console.log(5==5); //true
console.log(5=="5"); //true
//triple equals does not perform type coercion
console.log(5==="5"); //false
console.log(0==-0); //true

console.log(7+7+7); //21
console.log(7+7+"7"); //147
console.log("7"+7+7); //777
console.log(7+"7"+7); //777

//objects in javaScript 
//property value pairs
//object literals
var person={
    "name":"Jimmy",
    "age":74

}

//constructor

function Human(name,age){
    this.name=name;
    this.age=age;

}
//maker function
function MakePerson(name, age){
    var p={};
    p.name=name;
    p.age=age;
    return p;
}

function makePerson2(name,age) {
    var p={
        "name":name,
        "age":age
    }
    return p;
}
//Arrays
var myArray= [10,20,30];

/*
var vs. let vs. consta




*/
//Functions 3 invocations
//no overloading 
//Function form= "this" refers to the gloabal object, in browser it si the window
function dividByZero(kitty,kat){
console.log("here kitty kitty");
return (kitty+kat);
}
//constructor form - "this" refers to the object being made
var conFunc = function(a,b) {
    return a*b;
}

//method form - "this" refers to object its based off 
person.getInfo=function(){
    return this.age;
    
}