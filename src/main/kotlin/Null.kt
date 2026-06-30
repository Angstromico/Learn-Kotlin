package main.kotlin

fun main() {
    val text: String? = null //A null can be assigned to a value with '?'
    println(text)

    val name: String? = "Name"

    if(name?.length != 0) {
        println(name)
    }
}