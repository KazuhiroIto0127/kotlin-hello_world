fun main(args: Array<String>) {
    println("Hello World!")
    val test: String = "文字列"
    val array = arrayOf("あ","い","う","え")
    val test2 = null
    val human = Human()
    println(test)
    println(array)
    println(test.reversed())
    println(test2)
    println(human.hello("aah"))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}