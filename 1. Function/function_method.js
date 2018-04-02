//함수도 객체이므로, 함수에도 메소드가 있다. 대표적으로 call, apply, bind가 있다

'use strict'

function plus(a, b, c) {
    return a + b + c;
}

console.log(plus(1, 2, 3));
console.log(plus.apply(null, [1, 2, 3]));
console.log(plus.call(null, 1, 2, 3));