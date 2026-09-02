package main.kotlin

fun main() {
    printCollection(1, 2, 3)
    printCollection("A", "B", "C")
    printCollection(true, false, true)
}

fun <T> printCollection(vararg collection: T) {
    for (item in collection) {
        println(item)
    }
}