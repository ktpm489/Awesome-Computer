//참고 : http://programmingsummaries.tistory.com/325
//JS에는 Callback 함수라는 것이 있다. 이는 이벤트가 발생하였을 때 처리를 하기 위한 함수를 전달하는 일이 빈번하고 어떤 처리가 일어나고 그 후에 또 다른 처리를 하기 위해 콜백이 중첩되는 경우가 많다.
//이는 코드를 읽기에 매우 난해하고 복잡하다. 그렇기에 깔끔한 코드를 위한 Promise 패턴이 ES6에서 등장하였다.

let localVal = 0;

setTimeout(() => {
    console.log(localVal++);
    //...
    setTimeout(() => {
        //...
        console.log(localVal++);
        setTimeout(() => {
            //...
            console.log(localVal++);
            setTimeout(() => {
                //...
                console.log(localVal++);
                setTimeout(() => {
                    //...
                    console.log(localVal++);
                }, 1000);
            }, 1000);
        }, 1000);
    }, 1000);
}, 1000);

//TODO : 원래 있던 메소드를 프로미스를 사용해서 해결해보자

let firstPromise = (value) => {
    console.log(value);
    return new Promise((resolve, reject) => {
        resolve(value);
    });
};

firstPromise(1)
    .then((value) => {
        console.log(value++);
        return value;
    })
    .then((value) => {
        console.log(value++);
        return value;
    })
    .then((value) => {
        console.log(value++);
        return value;
    })
    .then((value) => {
        console.log(value++);
        return value;
    })
    .then((value) => {
        console.log(value++);
        return value;
    })
    .then((value) => {
        console.log(value++);
        return value;
    })
    .then((value) => {
        console.log(value++);
        return value;
    });