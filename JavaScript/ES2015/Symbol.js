//Link : https://gist.github.com/qodot/ecf8d90ce291196817f8cf6117036997
//Link2 : https://www.zerocho.com/category/EcmaScript/post/58ef98a6177375001892f891
//Link3 : http://hacks.mozilla.or.kr/2015/09/es6-in-depth-symbols/

/*
기존에는 원래 Number, Boolean, Null, Undefined, String, Object의 타입만이 존재했다. 이중 Object를 제외한 타입을 '원시타입'이라고 불렀다
심볼이란 ES6에서 새로 생긴 원시 타입이고 객체에 특별한, 유일한 속성을 주기 위하여 생겼다. Symbol은 다음과 같은 상황을 막아준다.
1. 다른 라이브러리를 쓸 때 그 객체의 프로퍼티는 중복이 될 수 있다.
2. for-in이나 Object.keys() 등과 같이 키의 개수를 세고 있는 코드가 있을 경우 문제가 발생한다.
*/


//선언 : var obj = Symbol('description');
var symbol1 = Symbol('symbol1');
var symbol2 = Symbol.for('symbol2');

console.log(symbol1 === Symbol('symbol1'));
//false, 생성할 때마다 새 값이 생성됨
console.log(symbol2 === Symbol.for('symbol2'));
//true, Symbol.for을 이용하여 심볼을 생성할 경우 같은 이름이 있을 경우 같은 값이 생성됨

console.log();

var obj;

obj[Symbol("feature1")] = "";

for (var index in obj) {
    console.log(obj[index]);
}
console.log(obj[symbol1]);

obj = {
    [symbol1]: 2,
    name: 'Lee',
    age: 19
};

for (var index in obj) {
    console.log(obj[index]);
}

console.log(obj[symbol1]);

