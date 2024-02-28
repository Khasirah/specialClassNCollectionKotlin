package com.haris

fun main() {
// pembuatan map
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

//    mengakses map
    println(capital["Jakarta"]) // apabila nilai "Jakarta" tidak ada, console akan menampilkan (null)
    println(capital.getValue("Jakarta")) // apabila nilai "Jakarta" tidak ada, console akan menampilkan exception

//    menampilkan seluruh keys dalam map
    val mapKeys = capital.keys

//    menampilkan seluruh value dalam map
    val mapValues = capital.values

//    menambahkan key-value ke dalam map
//    mengubah map capital menjadi mutable
    val mutableCapital = capital.toMutableMap()
//    menambahkan key-value
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

//    menggunakan mutable tidak disarankan
}