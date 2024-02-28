package com.haris

// digunakan sebagai dasar kotlin untuk digunakan sebagai Domain Spesific Language (DSL)
// DSL bahasa pemrograman yg dikhususkan u/ domain aplikasi tertentu
// keuntungan dapat menuliskan kode lebih ringkas dan ekspresif

fun main() {
//    pembuatan lambda with receiver
    fun buildString(action: StringBuilder.() -> Unit) : String {
        val stringBuilder = StringBuilder()
        stringBuilder.action()
        return stringBuilder.toString()
    }

//    pemakaian lambda with receiver
    val message = buildString {
        append("halo ")
        append("kamu ")
        append("apa kabar?")
    }
}

// import class di dalam function