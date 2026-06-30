package main.kotlin

fun main() {
    val text: String? = null //A null can be assigned to a value with '?'
    println(text)

    val name: String? = null

    if(name?.length != 0 || name != null) {
        println(name?.length)
    } else {
        println("The variable name is null")
    }
}