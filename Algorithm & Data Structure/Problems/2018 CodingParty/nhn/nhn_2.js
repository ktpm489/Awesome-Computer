// Run by Node.js

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let number, depth = 0;

rl.on("line", function(line) {
    number = parseInt(line, 10);
    rl.close();
}).on("close", function() {
    console.log(palindrome(number + R(number), ++depth));
    process.exit();
});

function palindrome(number, depth) {
    if(number >= 10000 || depth >= 4)
        return -1
    if(isPalindrome(number))
        return number;
    return palindrome(number + R(number), ++depth);
}

function isPalindrome(number) {
    let numStr = number.toString();
    let left = 0, right = numStr.length - 1;
    while(left <= right) {
        if(numStr.charAt(left) !== numStr.charAt(right))
            return false;
        left++, right--;
    }
    return true;
}

function R(number) {
    return parseInt(number.toString().split("").reverse().join().replace(/,/g, ""), 10);
}