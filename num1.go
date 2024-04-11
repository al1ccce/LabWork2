package main

import (
  "fmt"
)

func moves(hodi string, n, m int) (int, int) {
  for _, hod := range hodi {
    switch hod {
    case 'L':
      m--
    case 'R':
      m++
    case 'D':
      n++
    case 'U':
      n--
    default:
      fmt.Printf("%c is undefined\n", hod)
      return -123, 0
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
  fmt.Scan(&hodi)
  for i := 1; i <= n; i++ {
    for j := 1; j <= m; j++ {
      nnew, mnew := moves(hodi, i, j)
      if n > 0 && nnew <= n && m > 0 && mnew <= m {
        fmt.Printf("%d %d\n", i, j)
        goto exist
      }
      if nnew == -123 {
        goto doesntexist
      }
    }
  }

doesntexist:
  fmt.Println("No")

exist:
  return
}
