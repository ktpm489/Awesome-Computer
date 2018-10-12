//2016년의 어느 날의 요일을 반환

const WEEKDAY = ['THU', 'FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED'];
const DAYS = [0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335];

function solution(a, b) {
    return WEEKDAY[(DAYS[a - 1] + b) % 7];
}

console.log(solution(3, 1));