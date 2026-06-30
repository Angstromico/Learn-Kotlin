package main.kotlin

fun main() {
    println(salutations("Manuel"))
    val numbers = listOf(1, 2, 3, 4, 5)
    val greaterNumber = getMaxOfArr(numbers)

    println("The grater number of the list $numbers is $greaterNumber")
}

fun salutations(name: String): String {
    return "Hello $name"
}

fun getMaxOfArr(numbers: List<Int>): Int {
    var max = 0
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    return max
}