package com.haris

// 3 collection sebelumnya list, set dan map merupakan jenis collection yang menjalankan eager evaluation
// sequences merupakan lazy evaluation
// eager evaluation mengevaluasi seluruh item yg ada pada collection
// lazy evaluation mengevaluasi item jika benar2 diperlukan

fun main() {
//    kode untuk eager evaluation
    val list = (1..10000).toList()
    val number = list.filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)

//    konversi ke lazy evaluation atau sequences dengan asSequence()
    val list2 = (1..10000).toList()
    val number2 = list2.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number2)

//    pembuatan objek sequence
    val sequenceNumber = generateSequence(1) { it + 1 }

//    agar tidak mengalami infinite loop gunakan fungsi take()
    sequenceNumber.take(5).forEach { print("$it ") }
}