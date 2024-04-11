func whatTimeIsIt(number: Int) -> Bool {
    let hours = number / 100
    let minutes = number % 100
    return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59)
}

func yesOrNo(number: Int, n: Int) {
    if whatTimeIsIt(number: number) {
        print("YES")
    } else {
        print("NO")
    }
}

print("n = ", terminator: "")
if let n = Int(readLine() ?? "") {
    for _ in 0..<n {
        print("Enter the number: ", terminator: "")
        if let x = Int(readLine() ?? "") {
            yesOrNo(number: x, n: n)
        }
    }
}
