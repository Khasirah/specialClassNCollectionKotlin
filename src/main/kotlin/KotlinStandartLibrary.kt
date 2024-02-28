package com.haris

// scope function
// lambda expression yang memiliki ruang lingkupnya sendiri yang dapat mengakses konteks dari sebuah objek
// beberapa function let, run, with, apply, also
// bagaimana objek tersebut tersdia dan seperti apa hasil yg didapat dari seluruh expression yg berada di dalam blok

// context object
// bagaimana cara mengakses konteks sebuah objek dari dalam lambda
// 1. diakses sebagai lambda receiver (this)
// 2. diakses sebagai lambda argumen (it)

// lambda receiver (this)
// run, with dan apply
// run = object.run { block } -> Mirip dengan let, tetapi mengembalikan objek (berguna saat blok perlu memanggil metode objek).
// with = with(object) { block } -> Menjalankan blok dengan objek sebagai it, mengembalikan hasil blok.
// apply = object.apply { block } -> Menjalankan blok dengan objek sebagai it, mengembalikan objek yang dimodifikasi.

// lambda argument (it)
// let dan also
// let = object.let { block } -> menjalankan blok dengan it sebagai objek, mengambalikan hasil blok
// also = object.also { block } -> Menjalankan blok dengan objek sebagai it, mengembalikan objek asli.

// nilai yang dikembalikan
// apply dan also mengembalikan sebuah context object
// let, run dan with mengembalikan hasil berupa lambda

// pembuatan lambda receiver dan argument
class Person(var name: String, var age: Int)

fun main() {
    // apply: Menginisialisasi objek dan mengatur propertinya, kemudian mengembalikan objek tersebut
    val personApply = Person("John", 25).apply {
        println("apply: Initializing $name, age $age")
    }

    // also: Melakukan tindakan tambahan pada objek dan mengembalikan objek tersebut
    val personAlso = Person("Jane", 30).also {
        println("also: Initializing ${it.name}, age ${it.age}")
    }

    // let: Melakukan operasi pada objek dan mengembalikan hasil operasi tersebut
    val personLet = Person("Bob", 22).let {
        println("let: Initializing ${it.name}, age ${it.age}")
        "Result: ${it.name} is ${it.age} years old" // return value
    }
    println("let result: $personLet")

    // run: Menjalankan blok kode pada objek dan mengembalikan hasil blok kode tersebut
    val personRun = Person("Alice", 28).run {
        println("run: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
    println("run result: $personRun")

    // with: Menggunakan objek sebagai receiver untuk blok kode dan mengembalikan hasil blok kode tersebut
    val personWithResult = with(Person("Charlie", 35)) {
        println("with: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
    println("with result: $personWithResult")
}

// tidak paham wkwkwk