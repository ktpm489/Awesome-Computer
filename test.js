function splat(fun) {
    return (array) => {
        return fun.apply(null, array);
    };
}

var addArrayElements = splat((x, y) => {
    return x + y;
});

console.log(addArrayElements([1,2]));