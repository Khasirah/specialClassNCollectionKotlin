package com.haris

// function type : dapat membuat sebuah function menjadi type data
// pembuatan function type
typealias Arithmetic = (Int, Int) -> Int
// typealias memberikan nama alternatif dari sebuah function type

fun main() {
//    penggunaan function type u/ membuat instance
    val sum : Arithmetic = {valueA, valueB -> valueA + valueB}
    val multiply : Arithmetic = {valueA, valueB -> valueA * valueB}

//    penggunaan instance dari function type
//    dengan invoke
    val sumResult2 = sum.invoke(10,30)
//    tanpa invoke
    val sumResult = sum(10,10)
    val multiplyResult = multiply(10,12)

//    nullable function type
    val sumResult3 = sum?.invoke(10,5)
}