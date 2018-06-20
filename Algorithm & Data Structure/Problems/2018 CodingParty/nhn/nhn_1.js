// Run by Node.js

const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let count = 0, numbers, n1, n2;

rl.on("line", function (line) {
    if (count++ == 0)
        return;
    numbers = line.split(' ');
    rl.close();
}).on("close", function () {
    for(let i = 0; i < numbers.length; i++)
        numbers[i] = parseInt(numbers[i], 10);
    n1 = numbers.sort(
    /*
    ********
    TODO
    ********
    */).slice();
    n2 = numbers.reverse().slice();

    console.log(n1);
    console.log(n2);

    console.log(parseInt(n1.toString().replace(/,/g, ""), 10) + parseInt(n2.toString().replace(/,/g, ""), 10));
    
    process.exit();
});

/* 
5
2 9 10 21 24
9/24/2/21/10 + 10/21/2/24/9
*/