package com.example.cursoandroidkotlin.sintaxis

fun main() {
    listaMutable()
}

fun listaInmutable() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly.toString())
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())
    println("---------------------")
    //Filtro
    val example = readOnly.filter { it.contains("a") }
    println(example)
    println("---------------------")
    //Listar uno por uno
    readOnly.forEach { diaSemana -> println(diaSemana) }
}

fun listaMutable() {
    var diasSemana: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(diasSemana)
    diasSemana.add(0, "Sebastián")
    println(diasSemana)
    println("-------------------------------------")
    if (diasSemana.isEmpty()) {
        println("LISTA VACÍA")
    } else {
        diasSemana.forEach { diaSemana -> println(diaSemana) }
    }
}