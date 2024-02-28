package com.haris

// lambda expression biasa disebut dengan anonymous function atau function literal

// regular function
fun getMessage(name:String) : String {
    return "Hai, $name"
}

// function dengan lambda
val message : (String) -> String = {name : String -> "Hai, $name"}

// karakteristik lambda
// 1. tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya
// 2. lambda tidak membutuhkan kata kunci fun dan visibility modifier saat dideklarasikan karena lambda bersifat anonymous
// 3. Parameter yang akan ditetapkan berada di dalam kurung kurawal {}
// 4. Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan secara otomatis mengembalikan nilai dari dalam body
// 5. dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel

// membuat penulisan kode menjadi lebih mudah dan sederhana

// penggunaan lambda expression

// lambda polos
val messageF = {println("Hai from lambda")}

// lambda dengan parameter
val messageR = {msg : String -> println(msg)}

// lambda mengembalikan nilai
val messageI = {msg:String -> msg.length}
val lengthMessageI = messageI("hai bro")

fun main() {
//    perulangan dengan lambda
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { elem -> println(elem) }

//    memperoleh index dari setiap nilai dengan forEachIndex()
    ranges.forEachIndexed { index, i ->
        println("value of index $index is $i")
    }

//    apabila tidak menggunakan value dari range maka ganti dengan _
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}