package main

import (
	"fmt"
	"regexp"
	"sort"
)

const (
	emailRegex = "^[\\w-\\.]+@(gmail.)+[\\w-]{2,4}$"
	nMin       = 2
	nMax       = 30
)

func main() {
	var n int
	fmt.Scanf("%d", &n)

	var name, email string
	names := []string{}

	for i := 0; i < n; i++ {
		fmt.Scanf("%s %s", &name, &email)
		valid, _ := regexp.MatchString(emailRegex, email)
		if valid {
			names = append(names, name)
		}
	}
	sort.Strings(names)

	for _, name := range names {
		fmt.Println(name)
	}
}
