package com.haris

// Nested Class
class Home {
    val buildingArea = 100
    class Room {
        val totalRoom = 4
        fun measureRoomArea() {
//            tidak dapat akses properti outer class
//            print(buildingArea/totalRoom)
        }
    }
}

// Inner Class
class School {
    val buildingArea = 100
    val totalRoom = 4
    inner class Room {
        val totalRoom = 4
        fun measureRoomArea() {
            print(buildingArea/totalRoom)
        }
//        pemanggilan properti totalRoom outer class
        fun measureRoomArea2() {
            print(buildingArea/this@School.totalRoom)
        }
    }
}

fun main() {
//    inisialisasi class home
    val houseRoom = Home.Room()
//    inisialisasi class school
    val school = School()
    val schoolRoom = school.Room()
    schoolRoom.measureRoomArea()
    schoolRoom.measureRoomArea2()
}