fun main(args: Array<String>) {

    val array = listOf("A", "B", "C", "D", "E")

    for ((index, value) in array.withIndex()) {
        println("$index $value")
    }
}
