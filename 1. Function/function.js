//함수를 정의할 때에는 여러가지 방식을 사용할 수 있다.

function add(x, y) {
    return x + y;
}

var add2 = function (x, y) {
    return x + y;
}

var add3 = (x, y) => {
    return x + y;
}

var add4 = (x, y) => x + y;

var print = x => console.log(x);

print(add(1, 2));