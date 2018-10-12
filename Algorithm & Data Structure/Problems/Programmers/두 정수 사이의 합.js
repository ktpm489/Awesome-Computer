function solution(a, b) {
    return [...Array(Math.abs(a - b) + 1).keys()].map((e) => a < b ? e + a : e + b).reduce((n1, n2) => n1 + n2);
}

console.log(solution(3, 5));