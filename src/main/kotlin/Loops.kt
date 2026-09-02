package main.kotlin

fun main() {
    printCollection(1, 2, 3)
    printCollection("A", "B", "C")
    printCollection(true, false, true)
    printCollection(false, true, true, 0, "Animalia")

    iterateInRange(1,6)
    iterateInRange(6,1)

    iterateWithIndex(5, "Five")

    val booklet = Booklet(3)
    for (page in booklet) {
        println("Reading page $page")
    }
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
    println()
    println("\nOpen-ended range:")
    for (i in init..< end) {
        print(i)
    }
    println()
    println("\nReverse order in steps of 2:")
    for (i in end downTo init step 2) {
        print(i)
    }
    println()
}

fun <T> iterateWithIndex(vararg collection: T) {
    for(i in collection.indices) {
        println("Element at index $i is ${collection[i]}")
    }
    //Alternative
    for ((index, value) in collection.withIndex()) {
        println("The step at $index is \"$value\"")
    }
}

// Class iterator

class Booklet(val totalPages: Int) : Iterable<Int> {
    override fun iterator(): Iterator<Int> {
        return object : Iterator<Int> {
            var current = 1
            override fun hasNext() = current <= totalPages
            override fun next() = current++
        }
    }
}

