//참고 : https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/this
//참고2 : https://stackoverflow.com/questions/34838659/the-this-keyword-behaves-differently-in-nodejs-and-browser
//참고3 : http://poiemaweb.com/js-this
//참고4 : http://webframeworks.kr/tutorials/translate/explanation-of-this-in-javascript-1/

var obj1;
var obj2;

function x() {
    obj1 = this;
    obj2 = this;
}

function y() {
    this.x();
}

y();

console.log(obj1 === obj2);     //크롬과 Node.js에서 둘다 true
console.log(obj1 === this);      //크롬에서는 true, Node.js에서는 false