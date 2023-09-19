package com.example.cursoandroidkotlin.sintaxis

fun main() {
    val diasSemana =
        arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(diasSemana[0])
    println(diasSemana.size)

    if (diasSemana.size >= 8) {
        println(diasSemana[7])
    } else {
        println("No hay más valores en el array")
    }

    diasSemana[0] = "holi"
    println(diasSemana[0])
    println("--------------------------")

    /**
     * forEach
     */
    for (p in diasSemana){
        println(p)
    }
}