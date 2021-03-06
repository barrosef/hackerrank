/**
 * HackerHank challenge Day 01: Data Types, solved using JavaScript (Nodejs) programming language
 * 
 * Challenge
 * Declare three different data types variables int, double and String and initialize other three same datatype variables with three stdin inputs, finally 
 * - print the int initialized variable summed with first int variable
 * - print the double initialized variable summed with first double variable
 * - print the String initialized variable summed with first String variable 
 * 
 * @author Ed Barros / barrosef@gmail.com 
 */
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

// Reads complete line from STDIN
function readLine() {
    return input_stdin_array[input_currentline++];
}

function main() {
    var i = 4
    var d = 4.0
    var s = "HackerRank "

    var secondI = parseInt(readLine());
    var secondD = parseFloat(readLine());
    var secondS = readLine();

    console.log(i + secondI);
	console.log((d + secondD).toFixed(1));
    console.log(s + secondS);
}