import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    printLn("full bottles: ")
    var n = 0
    n = scanner.nextInt()
    printLn("empty bottles for exchange: ")
    var m = 0
    m = scanner.nextInt()
    var mc = n
    var mcount = n
    var count = 0
    var ost = 0
    var drinkedBottles = 0
    
    while (mcount > 0) {
        println("F".repeat(n))
        drinkedBottles += n
        count++
        mc = n + ost
        println("E".repeat(mc))
        ost = mc % m
        n = mc / m
        count++
        mc = ost
        mcount = n
    }
    
    println("$drinkedBottles ${count-1}")
}
