package main
import "fmt"
func main() {
	var n, m int
	fmt.Print("full bottles: ")
	fmt.Scan(&n)
	fmt.Print("empty bottles for exchange: ")
	fmt.Scan(&m)

	mc := n
	mcount := n
	count := 0
	ost := 0
	drinkedBottles := 0

	for mcount > 0 {
        for i := 0; i < n; i++{ 
            fmt.Printf("F")   
        }
        fmt.Print("\n")
		drinkedBottles += n
		count++
		mc = n + ost
	 for i := 0; i < mc; i++{ 
            fmt.Printf("E")   
        }
        fmt.Print("\n")

		ost = mc % m
		n = mc / m
		count++
		mc = ost
		mcount = n
