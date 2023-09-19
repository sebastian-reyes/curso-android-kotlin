package com.example.cursoandroidkotlin.sintaxis

fun main() {
    val name: String = "Sebastián"
    var nulo: String? = null

    println(nulo?.get(1) ?: "Es nulo")
}