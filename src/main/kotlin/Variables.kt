package main.kotlin

import java.util.Locale

fun main() {
    var userName: String = "Manuel Morales"
    var age: Int = 35
    val country : String = Locale.getDefault().displayCountry

    println("The user $userName has the age $age and country $country")

    userName = "Jose Pacheco"
    age = 30

    println("The user $userName is $age and country is $country")
}