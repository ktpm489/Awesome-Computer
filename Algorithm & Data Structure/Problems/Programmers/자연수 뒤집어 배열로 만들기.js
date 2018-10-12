function solution(n) {
    return n.toString().split('').reverse().map((e) => parseInt(e));
}

console.log(solution(12345));