package io.pivotal.shinyay

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("Kotlin!")

    return words.joinToString(separator = " ")
}

fun main(args: Array<String>) {
    println(getGreeting())
}
