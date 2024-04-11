import java.util.Scanner
fun moves(hodi: String, n: Int, m: Int): Pair<Int, Int> {
    var nloc = n
    var mloc = m
    for (hod in hodi) {
        when (hod) {
            'L' -> mloc--
            'R' -> mloc++
            'D' -> nloc++
            'U' -> nloc--
            else -> {
                println("$hod is undefined")
                return Pair(-123, 0)
            }
        }
    }
    return Pair(nloc, mloc)
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("n = ")
    var n = 0
    n = scanner.nextInt()
    println("m = ")
    var m = 0
    m = scanner.nextInt()
    println("moves: ")
    var hodi = ""
    hodi = scanner.nextLine()

    for (i in 1..n) {
        for (j in 1..m) {
            val (nloc, mloc) = moves(hodi, i, j)
            if (nloc in 1..n && mloc in 1..m) {
                println("$i $j")
                return
            }

            if (nloc == -123) {
                println("No")
                return
            }
        }
    }
    println("No")
}
