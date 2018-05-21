//참고 : http://programmingsummaries.tistory.com/325
//참고2 : https://developers.google.com/web/fundamentals/primers/promises?hl=ko
//JS에는 Callback 함수라는 것이 있다. 이는 이벤트가 발생하였을 때 처리를 하기 위한 함수를 전달하는 일이 빈번하고 어떤 처리가 일어나고 그 후에 또 다른 처리를 하기 위해 콜백이 중첩되는 경우가 많다.
//이는 코드를 읽기에 매우 난해하고 복잡하다. 그렇기에 깔끔한 코드를 위한 Promise 패턴이 ES6에서 등장하였다.

//Promise 패턴을 지원하는 mongoose를 Promise를 이용하여 해결해보자

const mongoose = require('mongoose');
const userModel = require('./model/User');

mongoose.Promise = global.Promise;

userModel.findOne({id: 'test123', pw: 'test123'})
    .then((result) => {
        return userModel.save({id: 'test123', pw: 'test123', age: 18});
    })
    .then((result) => {
        console.log('Success!');
    })
    .catch((err) => {
        console.log(err);
    });

//이렇게 Promise를 직접 대입할 수 있고, Promise를 리턴하는 함수를 정의해도 된다.
// let promiseObject = new Promise((resolve, reject) => {
//     resolve(1);
// });

// promiseObject
//     .then((value) => {
//         console.log(value++);
//         return value;
//     })
//     .then((value) => {
//         console.log(value++);
//         return value;
//     })
//     .then((value) => {
//         console.log(value++);
//         return value;
//     });