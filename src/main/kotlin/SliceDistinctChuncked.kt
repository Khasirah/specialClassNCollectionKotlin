package com.haris

data class Item(val key: String, val value: Any)

fun main() {
//    penggunaan slice()
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)

//    penggunaan step pada slice()
    val slice2 = total.slice(3..6 step 2)

    println(slice2)

//    penggunaan index pada slice()
    val index = listOf(2, 3, 5, 8)
    val slice3 = total.slice(index)

    println(slice3)

//    penggunaan distinct()
    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total2.distinct()

    println(distinct)

//    penggunaan distinct() pada object collection
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val disctinctItems = items.distinctBy { it.key }
    disctinctItems.forEach {
        println("${it.key} with values ${it.value}")
    }

//    penggunaan distinctBy() panjang karakter
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy {
        it.length
    }

    println(distinct2)

//    penggunaan chuncked() u/ memecah string menjadi beberapa bagian kecil
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)

//    penggunaan chunked() u/ memodifikasi nilai yg telah dipecah
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}