//연산자의 종류

// -, /, * 는 각각 빼기, 나누기, 곱하기를 수행한다
console.log(5 - 3);     //2
console.log(6 / 3);     //2
console.log(2 * 1)     //2

console.log('-----------------------------------');

//+연산자
//더하기와 문자열을 합쳐준다
console.log(1 + 2);    //3
console.log('결과는 ' + 3 + '입니다.');    //결과는 3입니다

console.log('-----------------------------------');

//typeof 연산자
//뒤에 오는 값의 타입을 확인한다
console.log(typeof 1);      //number
console.log(typeof 'string');   //string
console.log(typeof true);   //boolean
console.log(typeof undefined);  //undefined
console.log(typeof null);   //object
console.log(typeof {});     //object
console.log(typeof [1,2,3]);    //object

console.log('-----------------------------------');

//==와 === 연산자
//==는 값만, ===는 값과 타입 모두 확인
console.log(1 == '1');      //true
console.log(1 === '1');   //false

console.log('-----------------------------------');

//!!연산자
//피연산자를 값에 따라 boolean값으로 변환해준다
console.log(!!0);       //false
console.log(!!1);       //true
console.log(!!'');       //false
console.log(!!'hello');  //true
console.log(!!{});       //true
console.log(!!undefined);    //false
console.log(!!null);    //false