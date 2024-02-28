package com.haris

// generic
// yaitu sebuah konsep yang memungkinkan suatu kelas atau interface menjadi tipe parameter yang dapat digunakan untuk berbagai macam tipe data
// generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan

// constraint type parameter
// bisa membatasi berbagai tipe yang dapat digunakan sebagai parameter
// Untuk menentukkan batasan tersebut, Anda dapat menambahkan tanda titik dua (:) setelah tipe parameter
// kemudian diikuti oleh tipe yang akan dijadikan batasan


// Namun, Anda perlu untuk menentukan tipe data dari object tersebut ketika nilainya belum ditetapkan.

// deklrasi class generic
interface List<T>{
    operator fun get(index: Int) : T
}
// T bisa diganti menggunakan karakter lain

class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

// deklarasi fungsi generic
/*
fun <T> run(): T {
}
*/

// extension function slice
/*
public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    /*...*/
}
*/

// deklarasi constraint type parameter

class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}
// Pada kode di atas, kita telah menentukan Number sebagai batasan tipe argumen. Dengan begitu, kita hanya bisa memasukkan tipe argumen Number pada kelas ListNumber.
// Maksud dari tipe Number ini berarti, Integer, Long, Double, dan tipe angka lainnya

/*
fun <T : Number> List<T>.sumNumber() : T {
}
*/


fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)

//    penggunaan constraint type parameter
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>() error krn String tidak ada di list type number
}