package com.haris

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}
// jika tidak menggunakan keyword data maka method harus ditambahkan secara manual

data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val user = User(name = "haris", age = 25)
    val dataUser = DataUser(name = "popi", age = 29)
    val dataUser2 = DataUser(name = "lestari", age=29)
    val dataUser3 = DataUser(name = "popi", age = 29)

    println(user)
    println(dataUser)
// fungsi equals pada Data Class
    println("dataUser = dataUser2 ? ${dataUser == dataUser2}")
    println("dataUser = dataUser3 ? ${dataUser.equals(dataUser3)}")
// fungsi copy pada Data Class
    val dataUser4 = dataUser.copy()
    println("dataUser4=$dataUser4")
//    fungsi copy dengan mengubah nilai
    val dataUser5 = dataUser.copy(age = 20)
    println("dataUser5=$dataUser5")

//    destructuring declarations
    val nameDataUser = dataUser.component1()
    val ageDataUser = dataUser.component2()
    println("dataUser(name=$nameDataUser, age=$ageDataUser)")

    val (name, age) = dataUser4
    println("dataUser4(name=$name, age=$age)")

//    menambahkan method pada data class
//    mengakses method pada data class
    dataUser2.intro()
}