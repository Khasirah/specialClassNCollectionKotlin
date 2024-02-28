package com.haris

// references (::)
// function references
fun isEvenNumber(number: Int) = number % 2 == 0
// extension function
fun Int.isEvenNumber2() = this % 2 == 0

// property references
// mutable variable
var messages = "Kotlin"
// immutable variable
val messagesr = "Kotlin"

fun main() {
//    penggunaan function references
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

//    penggunaan extension function sebagai references
    val numbers2 = 1.rangeTo(10)
    val evenNumbers2 = numbers2.filter(Int::isEvenNumber2)
    println(evenNumbers2)

//    referensi properti messages
    println(::messages.name)
    println(::messages.get())

    ::messages.set("Kotlin Academy")

    println(::messages.get())

//    referensi properti messagesr
    println(::messagesr.name)
    println(::messagesr.get())

//    ::messagesr.set("Haris") akan terjadi error krn immutable variable
}