package main
import (
	"fmt"
)
func WhatTimeIsIt(number int) bool {
	hours := number / 100
	minutes := number % 100
	return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59)
}
func YesOrNo(number int, n int) {
	if WhatTimeIsIt(number) {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}

func main() {
	var n int
	fmt.Print("n = ")
	fmt.Scan(&n)
	for i := 0; i < n; i++ {
		var x int
		fmt.Print("Enter the number: ")
		fmt.Scan(&x)
		YesOrNo(x, n)
	}
}
