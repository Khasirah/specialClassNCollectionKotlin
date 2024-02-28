package com.haris

fun main() {
//    penggunaan fold()
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

//    penggunaan foldRight()
    val fold2 = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold2")

//    penggunaan drop()
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop)

//    penggunaan lastDrop()
    val drop2 = number.dropLast(3)

    println(drop2)

//    penggunaan take()
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

//    penggunaan lastTake()
    val take2 = total.takeLast(3)

    println(take2)
}