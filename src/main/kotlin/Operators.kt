package main.kotlin

fun main() {
    val x = 5
    val y = 8

    val sum = x + y
    val subtraction = x - y
    val multiplication = x * y
    val division: Float = x.toFloat() / y
    val module = x % y

    println("The sum is $sum")
    println("The subtraction is $subtraction")
    println("The multiplication is $multiplication")
    println("The division is $division")
    println("The module is $module")
}
