/*
JavaScript에서 클래스를 만드는 법은 2가지가 있다. 
1. 생성자 함수를 만들고 그 함수의 prototype 속성과 new를 이용하기
2. class, constructor와 new를 이용하기
이 둘은 사실 내부적으로는 똑같다
*/

function human(name, age) {
    this.name = name;
    this.age = age;
}

human.prototype.eat = noArg => console.log('냠냠쩝쩝');
human.prototype.walk = noArg =>  console.log('걸어다니기');

let kim = new human('kim', '18');
kim.eat();
kim.walk();

class student{
    //TODO : static field 추가하기, static method 추가하기, 학생 숫자세는것
    constructor(name, age, grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    get name() {
        return this.name;
    }

    set name() {
        return this.name;
    }

    eat() {
        console.log('급식실에서 냠냠쩝쩝');
    }
}