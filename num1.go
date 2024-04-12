package main

import (
	"fmt"
)

func moves(hodi string, n int, m int, nlocal int, mlocal int) (int, int) {
	for _, hod := range hodi {
		switch hod {
		case 'L':
			m -= 1
		case 'R':
			m += 1
		case 'D':
			n += 1
		case 'U':
			n -= 1
		default:
			fmt.Println(string(hod), " is undefined")
			return -123, 0
		}
		if n <= 0 || n > nlocal || m <= 0 || m > mlocal {
			return 0, 0
		}
	}
	return n, m
}

func main() {
	var n, m int
	fmt.Print("n = ")
	fmt.Scan(&n)
	fmt.Print("m = ")
	fmt.Scan(&m)
	var hodi string
	fmt.Print("moves = ")
	fmt.Scan(&hodi)

	for i := 1; i <= n; i++ {
		for j := 1; j <= m; j++ {
			nnew, mnew := moves(hodi, i, j, n, m)
			if nnew > 0 && nnew <= n && mnew > 0 && mnew <= m {
				fmt.Println(i, j)
				return
			}
			if nnew == -123 {
				fmt.Println("No")
				return
			}
		}
	}
	fmt.Println("No")
}
