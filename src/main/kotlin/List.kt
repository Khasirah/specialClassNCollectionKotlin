package com.haris

// pembuatan immutable list
val numberList : List<Int> = listOf(1,2,3,4,5)
val numberList2 = listOf(1,2,3,4,5)
val charList = listOf('a','b','c','d')
val anyList = listOf('a', "Kotlin", 1, User("haris", 12))

// pembuatan mutableList
val anyList2 = mutableListOf('a', "Kotlin", 1, User("haris", 12))

fun main() {
    print(anyList[2])

//    menambah mutableList
    anyList2.add('d')
    anyList2.add(3, "love")
//    mengubah isi mutableList
    anyList2[0]=false
//    menghapus isi mutableList
    anyList2.removeAt(5)

//    start of perbedaan array dan list
//    ---------------------------------
    val array = arrayOf("Kotlin", "Java")
//    array[0] = "Dart" // no error
//    array.add("JavaScript") // error

    val list = listOf("Kotlin", "Java")
//    list[0] = "Dart" // error
//    list.add("JavaScript") //error

    val mutableList = mutableListOf("Kotlin", "Java")
    mutableList[0] = "Dart" // no error
    mutableList.add("JavaScript") // no error

    val arrayList = arrayListOf("Kotlin", "Java")
    arrayList[0] = "Dart" // no error
    arrayList.add("JavaScript") // no error
//    ---------------------------------
//    end of perbedaan array dan list
}