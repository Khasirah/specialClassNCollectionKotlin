package com.haris

// run
// fungsi run akan mengambalikan nilai berdasarkan expression yg berada di dalam blok lambda
// menggunakan receiver (this)
// berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian

// with

fun main() {
//     run
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

//     with
    val message = "Hello Kotlin!"
    val result2 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

//    with dengan return value
    val message1 = "Hello Kotlin!"
    val result3 = with(message1) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result3)

//    apply
//    tanpan fungsi apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())

//    dengan fungsi apply
    val message2 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message2.toString())
}