package main.kotlin

import java.util.Locale

fun main() {
    val integerMaxValue = Integer.MAX_VALUE
    val integerMinValue = Integer.MIN_VALUE

    println("Max Integer: $integerMaxValue - Min Integer: $integerMinValue")

    val byteMaxValue = Byte.MAX_VALUE
    val byteMinValue = Byte.MIN_VALUE

    println("Min Byte: $byteMaxValue - Max Byte: $byteMinValue")

    val floatMaxValue = Float.MAX_VALUE
    val floatMinValue = Float.MIN_VALUE

    println("Max Float: $floatMaxValue - Min: $floatMinValue")

    val doubleMaxValue = Double.MAX_VALUE
    val doubleMinValue = Double.MIN_VALUE

    println("Min Double: $doubleMaxValue - Min: $doubleMinValue")

    val shortMaxValue = Short.MAX_VALUE
    val shortMinValue = Short.MIN_VALUE

    println("Max Short: $shortMaxValue - Min Short: $shortMinValue")

    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE

    println("Min Long: $longMaxValue - Min Long: $longMinValue")
}