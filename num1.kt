import java.util.Scanner

fun moves(hodi: String, n: Int, m: Int, nlocal: Int, mlocal: Int): Pair<Int, Int> {
    var n = n
    var m = m
    for (hod in hodi) {
        when (hod) {
            'L' -> m--
            'R' -> m++
            'D' -> n++
            'U' -> n--
            else -> {
                println("$hod is undefined")
                return Pair(-123, 0)
            }
        }
        if ((m <= 0 || m > mlocal) || (n <= 0 || n > nlocal)) {
            return Pair(0, 0)
        }
    }
    return Pair(n, m)
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("n = ")
    val n = scanner.nextInt()

    print("m = ")
    val m = scanner.nextInt()

    print("moves = ")
    val hodi = scanner.next()

    for (i in 1..n) {
        for (j in 1..m) {
            val p = moves(hodi, i, j, n, m)
            if ((p.first > 0 && p.first <= n) && (p.second > 0 && p.second <= m)) {
                println("$i $j")
                return
            }
            if (p.first == -123) {
                return
            }
        }
    }
    println("NO")
}
