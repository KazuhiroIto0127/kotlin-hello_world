import kotlin.system.measureTimeMillis
fun fib(n: Int): Int {
    if (n <= 1) {
        return n
    }
    return fib(n-1) + fib(n-2)
}

fun main() {
    val elapsedTime = measureTimeMillis {
        for (i in 1..5) {
            println(fib(40))
        }
    }
    println("${elapsedTime/1000.0}ms")
}