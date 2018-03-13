function splat(fun) {
    return (array) => {
        return fun.applay(null, array);
    }
}

var addArrayElements = splat((x, y) => {
    return x + y;
});