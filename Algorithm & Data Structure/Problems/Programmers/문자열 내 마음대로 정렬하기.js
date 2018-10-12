function solution(strings, n) {
    return strings.sort((a, b) => b[n] - a[n]);
}

console.log(solution(['sun', 'bed', 'car'], 1));