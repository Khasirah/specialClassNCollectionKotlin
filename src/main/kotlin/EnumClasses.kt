package com.haris

import kotlin.enums.EnumEntries

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("Value of RED is $value")
        }
                  },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("Value of GREEN is $value")
        }
                    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("Value of BLUE is $value")
        }
    };

//    menambahkan abstract function
//    menggunakan abstract function pada setiap objek enum
    abstract fun printValue()
}

fun main() {
//    pembuatan variabel tanpa enum class
    val colorRedT = 0xFF0000
    val colorGreenT = 0x00FF00
    val colorBlueT = 0x0000FF

//    pemakaian class color
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    println(colorRed)
    println(colorGreen)
    println(colorBlue)

//    synthetic method pada enum class
//    u/ mendapatkan daftar objek enum class
    val colors : Array<Color> = Color.values()
    println("Daftar objek enum pada class color")
    colors.forEach {color ->
        print("$color ")
    }

//    mendapatkan nilai dari setiap objek color
    val valColorRed : Color = Color.valueOf("RED")
    println("color is $valColorRed")
    println("value of color is ${valColorRed.value.toString(16)}")
    println("index of color is ${valColorRed.ordinal}")

//    mengecek instance dari enum
    when(valColorRed) {
        Color.GREEN -> print("color is green")
        Color.RED -> print("color is red")
        Color.BLUE -> print("color is blue")
        else -> print("color not listed")
    }
}