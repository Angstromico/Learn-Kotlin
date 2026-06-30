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

    var name2: String? = "Second"
    name2 = null
    println(name2?.length)

    var name3: String? = null
    println(name3!!.length) //This is through and exception
}