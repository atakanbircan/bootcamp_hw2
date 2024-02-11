package com.myapplication.odevdosyasi.cokgen_ic_acilar_toplami

fun main() {
    println("Lütfen kenar sayısı giriniz : ")
    val n = readLine()
    n?.let {
    val cokgen = Cokgen(n.toInt())

    println("$n kenarlı çokgenin iç açılar toplamı : ${cokgen.icAcilarToplami()}")

        }
    }