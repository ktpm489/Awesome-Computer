// Run by Node.js

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let count = 0, points, p1, p2;

rl.on("line", function(line) {
    if(count++ == 0)
        return;
    points = line.split(' ');
    for(let i = 0; i < points.length; i++)
        points[i] = parseInt(points[i], 10);
    rl.close();
}).on("close", function() {
    let min = Infinity;
    for(let i = 0; i < points.length; i++) {
        for(let j = i + 1; j < points.length; j++) {
            if(min > Math.abs(points[i] - points[j])) {
                min = Math.abs(points[i] - points[j]);
                p1 = i, p2 = j;
            } else if(min === Math.abs(points[i] - points[j])) {
                if(points[p1] + points[p2] > points[i] + points[j])
                    p1 = i, p2 = j;
            }
        }
    }

    if(points[p1] > points[p2]) {
        let tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    console.log(points[p1] + ' ' + points[p2]);
    process.exit();
});