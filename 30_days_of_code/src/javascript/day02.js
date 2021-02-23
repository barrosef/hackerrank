'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

//Creating one hundred constant to use in calculus
const ONE_HUNDERD = 100;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

function getValueFromPercent(value, percent) {
    return value * (percent / ONE_HUNDERD);
}

// Complete the solve function below.
function solve(meal_cost, tip_percent, tax_percent) {
    var tip_cost = getValueFromPercent(meal_cost, tip_percent);
    var tax_cost = getValueFromPercent(meal_cost, tax_percent);

    var total_cost = Math.round(meal_cost + tip_cost + tax_cost);

    console.log(total_cost)
}

function main() {
    const meal_cost = parseFloat(readLine());

    const tip_percent = parseInt(readLine(), 10);

    const tax_percent = parseInt(readLine(), 10);

    solve(meal_cost, tip_percent, tax_percent);
}

