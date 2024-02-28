package com.haris

// recursion
fun factorial(n: Int) : Int {
    if (n == 1) {
        return n
    }
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

// tail call recursion
// yakni sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur
//Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan
// menambahkan tailrec modifier

tailrec fun factorial2(n: Int, result: Int) : Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial2(n - 1, newResult)
    }
}


fun main() {
    val fact = factorial(3)
    print(fact)
}