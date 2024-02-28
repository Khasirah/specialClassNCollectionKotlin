package com.haris

// pembuatan singleton object
object CentralLibrary {
    fun borrowBookById(id: Int) {
        println("Book with $id has been borrowed")
    }
}

// pembuatan companion object
class Library {
    companion object {
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

// pembuatan companion object u/ konstanta variabel
class MyLibrary {
    // Const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook() {
        print("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object{
        const val LIBRARY_NAME = "Haris Library"
    }
}

// pembuatan anonymous class
interface Ifly {
    fun fly()
}

fun flyWithWings(bird: Ifly) {
    bird.fly()
}
// end pembuatan anonymous class

fun main() {
//        penggunaan SAM function
//    flyWithWings {
//        println("The Penguin flying")
//    }

//    penggunaan singleton object
    CentralLibrary.borrowBookById(12)

//    penggunaan companion objecy
    Library.Companion.borrowBookById(32)
    Library.borrowBookById(42)

//    pemanggilan library name
    val libraryName = MyLibrary.LIBRARY_NAME

//    penggunaan anonymous class
    flyWithWings(object : Ifly {
        override fun fly() {
            print("The bird flying 🦅")
        }
    })
}