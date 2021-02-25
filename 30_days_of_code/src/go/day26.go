/**
 * Hacker Rank challenge day 26: Nested Logic, solved using Go programming language
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
package main

import (
	"fmt"
	"time"
)

func main() {

	var rD, rM, rY, eD, eM, eY int
	fmt.Scanf("%d %d %d", &rD, &rM, &rY)
	fmt.Scanf("%d %d %d", &eD, &eM, &eY)

	r := time.Date(rY, time.Month(rM), rD, 0, 0, 0, 0, time.UTC)
	d := time.Date(eY, time.Month(eM), eD, 0, 0, 0, 0, time.UTC)

	fine := 0

	if r.Sub(d).Hours() > 0 {
		if r.Year() != d.Year() {
			fine = 10000
		} else if r.Month() != d.Month() {
			fine = 500 * (rM - eM)
		} else {
			fine = 15 * (rD - eD)
		}
	}

	fmt.Println(fine)
}
