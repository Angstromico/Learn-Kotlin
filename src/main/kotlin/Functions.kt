package main.kotlin

fun main() {
    println(salutations())
    println(messageNamed(message = "Xmas"))
    val numbers = listOf(1, 2, 3, 4, 5)
    val greaterNumber = getMaxOfArr(numbers)

    println("The grater number of the list $numbers is $greaterNumber")
}

fun salutations(name: String = "Manuel"): String {
    return "Hello $name"
}

fun messageNamed(name: String = "Sam", message: String = "Hello"): String {
    return "Hello $name the message is $message"
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