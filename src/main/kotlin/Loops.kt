package main.kotlin

fun main() {
    printCollection(1, 2, 3)
    printCollection("A", "B", "C")
    printCollection(true, false, true)
    printCollection(false, true, true, 0, "Animalia")

    iterateInRange(1,6)
    iterateInRange(6,1)
}

fun <T> printCollection(vararg collection: T) {
    for (item in collection) {
        println(item)
    }
}

//To iterate over a range of numbers, use a range expression with .. and ..< operators:

fun iterateInRange(init: Int, end: Int) {
    if(init >= end) {
        println("$init is greater than $end so you can't iterate over that range")
        return
    }

    println("Closed-ended range:")
    for (i in init..end) {
        print(i)
    }
}