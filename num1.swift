import Foundation
func moves(hodi: String, n: Int, m: Int, nlocal: Int, mlocal: Int) -> (Int, Int) {
    var n = n
    var m = m
    
    for hod in hodi {
        switch hod {
        case "L":
            m -= 1
        case "R":
            m += 1
        case "D":
            n += 1
        case "U":
            n -= 1
        default:
            print("\(hod) is undefined")
            return (-123, 0)
        }
        
        if n <= 0 || n > nlocal || m <= 0 || m > mlocal {
            return (0, 0)
        }
    }
    
    return (n, m)
}

func main() {
    var n = 0
    var m = 0
    print("n = ")
    if let input = readLine(), let inputInt = Int(input) {
        n = inputInt
    }
    
    print("m = ")
    if let input = readLine(), let inputInt = Int(input) {
        m = inputInt
    }
    
    var hodi = ""
    print("moves: ")
    if let input = readLine() {
        hodi = input
    }
    
    for i in 1...n {
        for j in 1...m {
            let p = moves(hodi: hodi, n: i, m: j, nlocal: n, mlocal: m)
        
        if (p.0 > 0 && p.0 <= n && p.1 > 0 && p.1 <= m) {
            print(i, j)
            exit(0)
        }
        
        if p.0 == -123 {
            print("No")
            exit(0)
        }
    }
}
    print("No")
}



main()
