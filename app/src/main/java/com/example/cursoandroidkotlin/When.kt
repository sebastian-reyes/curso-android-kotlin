package com.example.cursoandroidkotlin

fun main() {
    getMonth(11)
    getTrimestre(2)
    println(getSemestre(1))
    result("String cualquiera xd")
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes válido")
    }
}

fun getTrimestre(trimestre: Int) {
    when (trimestre) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimistre no válido")
    }
}

/**
 * Rangos en kotlin
 */

fun getSemestre(semestre: Int): String {
    return when (semestre) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        else -> "Semestre no válido"
    }
}

//Tipo de dato Any (cualquier cosa xd)
fun result(value: Any) {
    when (value) {
        is Int -> println(value * 2)
        is String -> println(value)
        is Boolean -> if (value) println("Hola")
    }
}