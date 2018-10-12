function solution(arr, divisor) {
    arr = arr.filter((val, index) => val % divisor == 0).sort((a, b) => a - b);
    return arr.length ? arr : [-1];
}

console.log(solution([5,9,7,10], 5));