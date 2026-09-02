package main.kotlin

fun main() {
    printCollection(1, 2, 3)
    printCollection("A", "B", "C")
    printCollection(true, false, true)
    printCollection(false, true, true, 0, "Animalia")
}

fun <T> printCollection(vararg collection: T) {
    for (item in collection) {
        println(item)
    }
}