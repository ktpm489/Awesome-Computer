function solution(arr)
{
    let newArr = [], index = -1;
    for(let i of arr)
        if(newArr[index] !== i)
            newArr[++index] = i;
    return newArr;
}

console.log(solution([4, 4, 4, 3, 3]));