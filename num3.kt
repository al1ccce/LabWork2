import java.util.Scanner
fun whatTimeIsIt(number: Int): Boolean {
    val hours = number / 100
    val minutes = number % 100
    return (hours in 0..23) && (minutes in 0..59)
}

fun yesOrNo(number: Int, n: Int) {
    if (whatTimeIsIt(number)) {
        println("YES")
    } else {
        println("NO")
    }
}

fun main() {
  val scanner = Scanner(System.`in`)
    print("n = ")
    var n = 0
    n = scanner.nextInt()
    for (i in 0 until n) {
        print("Enter the number: ")
        var x = scanner.nextInt()
        yesOrNo(x, n)
    }
}
