/**
 * <strong>Hacker Rank</strong> challenge <strong>day 28: Regex</strong>, solved using <strong>JavaScript Nodejs</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Create regex the check that name and e-mail is valid in lowercase form
 * 
 * @author barrosef@gmail.com
 */
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

/**
 * Regular expression to extract name of e-mail address
 */
const EMAIL_RE = new RegExp("^[\\w-\\.]+@(gmail.)+[\\w-]{2,4}$");

/**
 * Minimal value to N
 */
const N_MIN= 2;

/**
 * Maximum value to N
 */
const N_MAX= 30;
 
/**
 * Print when constraint N_MIN <= n <= N_MAX not compliance
 */
const N_CONSTRAINT_ERROR_MSG ="n = %o is not compliance with constraint %o <= n <= %o";

 
let inputString = '';
let currentLine = 0;

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



function main() {
    const N = parseInt(readLine(), 10);
    let names = [];
    for (let NItr = 0; NItr < N; NItr++) {
        const firstNameEmailID = readLine().split(' ');
        if (firstNameEmailID[1].match(EMAIL_RE)) {
            names.push(firstNameEmailID[0]);
        }
    }
    names.sort();
    names.forEach(name => console.log(name));
}