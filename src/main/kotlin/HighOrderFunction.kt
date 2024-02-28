package com.haris

// high-order function
// sebuah fungsi yg menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian ataupun keduanya

// membuat fungsi sum yg akan digunakan sebagai parameter
var sum : (Int) -> Int = {value -> value + value}

// membuat fungsi yang menggunakan fungsi sum
fun printResult (value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

// inline function
// berguna u/ menghemat memori saat compile high-order function

// menambahkan (inline) akan menjadi inline function
inline fun printResult2 (value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun main() {
//    pemanggilan fungsi cara 1
    printResult(10, sum)

//    pemanggilan fungsi cara 2 langsung menuliskan lambdanya
//    cara ini tidak memerlukan sum, karena fungsi lambda langsung ditulis
    printResult(12, {value ->
        value + value
    })

//    pemanggilan fungsi cara 3 lambda dapat ditulis di luar paranthesis
//    cara ini tidak memerlukan sum, karena fungsi lambda langsung ditulis
    printResult(23) {value -> value + value}
}

// penggunaan inline menyebabkan file binary program menjadi lebih besar dan memperlambat waktu kompilasi
// dipikirkan lagi dengan baik sebelum menggunakan inline