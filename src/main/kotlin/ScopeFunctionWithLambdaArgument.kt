package com.haris

// let
// akan banyak ditemukan pada objek yg bertipe nullable

// also
// baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya

fun main() {
//    let
//    let pada objek bertipa nullable
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

//    kode diatas dapat ditulis seperti berikut
    val message2: String? = null
    val length = message2?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

//    menjalankan kode lain jika objeknya bernilai null
    val message3: String? = null
    message3?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

//    alse
    val text2 = "Hello Kotlin"
    val result = text2.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}