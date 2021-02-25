/**
 * Hacker Rank challenge day 26: Nested Logic, solved using JavaScript (Nodejs) programming language
 * 
 * Challenge
 * 
 * Calculate the fine like as: 
 * When return date is late in days fine is (days difference * 15)
 * When return date is late in months fine is (months differences * 500)
 * When return date is late in years fine is 10000
 * When no late return fine is 0
 * 
 * @author Ed Barros - barrosef@gmail.com
 */
process.stdin.resume();
process.stdin.setEncoding("utf-8");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   input_arr = _input.split("\n"); // Split the input lines
   processData(input_arr);
});

const ZERO = 0;
const FIFTEEN = 15;
const FIVE_HUNDRED = 500;
const TEN_THOUSAND = 10000;

function processData(input) {
    const [rd, rm, ry] = toIntValues(input[0]);
    const [ed, em, ey] = toIntValues(input[1]);
    var fine = ZERO;

    if (ry > ey) {
        fine = TEN_THOUSAND;
    } else if (ry == ey && rm > em) {
        fine = FIVE_HUNDRED * (rm - em);
    } else {
        fine = ((ry == ey && rm == em) && rd > ed) ? FIFTEEN * (rd - ed) : fine;
    }

    console.log(fine);
}

function toIntValues(input) {
    return input.split(" ").map(value => Number.parseInt(value));
}