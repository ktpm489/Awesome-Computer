//참고 : https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/this
//참고2 : https://stackoverflow.com/questions/34838659/the-this-keyword-behaves-differently-in-nodejs-and-browser

var obj1;
var obj2;

function x() {
    obj1 = this;
}

function y() {
    obj2 = this;
}

x();
y();

console.log(obj1 === obj2);     //크롬과 Node.js에서 둘다 true
console.log(obj1 === this);      //크롬에서는 true, Node.js에서는 false

/*
    좀 더 알아봐야되요
*/