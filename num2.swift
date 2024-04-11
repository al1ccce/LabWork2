import Foundation

func main() {
    var n = 0
    print("full bottles: ")
    if let input = readLine() {
        if let intValue = Int(input) {
            n = intValue
        }
    }
    
    var m = 0
    print("empty bottles for exchange: ")
    if let input = readLine() {
        if let intValue = Int(input) {
            m = intValue
        }
    }
    
    var mc = n
    var mcount = n
    var count = 0
    var ost = 0
    var drinkedBottles = 0
    
    while mcount > 0 {
        print(String(repeating: "F", count: n))
        drinkedBottles += n
        count += 1
        mc = n + ost
        print(String(repeating: "E", count: mc))

        ost = mc % m
        n = mc / m
        count += 1
        mc = ost
        mcount = n
    }
    
    print(drinkedBottles, count-1)
}

main()
