package com.haris

// variance
// salah satu konsep dari generic
/* Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe yang sama
dan tipe argumen yang berbeda saling berkaitan satu sama lain */
// Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic dengan batasan yang tidak akan mengganggu dalam penggunaannya

abstract class Vehicle(wheel: Int)
class Car(speed:Int) : Vehicle(4)
class Motorcycle(speed: Int) : Vehicle(2)

// covariant
interface List98<out E> : Collection<E> {
    operator fun get(index: Int): E
}
/* Ketika kita menandai sebuah tipe parameter dengan kata kunci out,
nilai dari tipe parameter tersebut hanya bisa diproduksi seperti menjadikanya sebagai return type */

/* Serta tidak dapat dikonsumsi
seperti menjadikannya sebagai tipe argumen untuk setiap fungsi di dalam kelas tersebut */

open class Binatang
class Kucing : Binatang()

class Kandang<out T : Binatang>(private val hewan: T) {
    fun dapatkanHewan(): T {
        return hewan
    }
}

val kandangKucing: Kandang<Kucing> = Kandang(Kucing())
val kandangBinatang: Kandang<Binatang> = kandangKucing

// contravariant
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}
/* Nilai dari tipe parameter tersebut bisa dikonsumsi dengan menjadikannya sebagai tipe argumen
untuk setiap fungsi yang ada di dalam kelas tersebut dan tidak untuk diproduksi. */

class PenjagaKandang<in T : Binatang> {
    fun urusKandang(hewan: T) {
        // Melakukan sesuatu dengan kandang yang berisi hewan
    }
}

val penjagaBinatang: PenjagaKandang<Binatang> = PenjagaKandang<Binatang>()
val penjagaKucing: PenjagaKandang<Kucing> = penjagaBinatang

fun main() {
    val car = Car(200)
    val motorCycle = Motorcycle(120)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(200), Car(250))
    val vehicleList = carList
}