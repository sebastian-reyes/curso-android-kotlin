package com.example.cursoandroidkotlin

fun main() {
    println("Valores(Constantes) - Variables:")

    /**
     * Valores Numéricas
     */
    //Integer
    val edad: Int = 21

    //Long - a partir de acá el uso de memoria se incrementa
    val edadLong: Long = 21

    //float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 30.5

    /**
     * Valores alfanuméricas
     */

    //Char (un solo caracter)
    val charExample: Char = 'c'
    val charExample2: Char = '@'
    val charExample3: Char = '3'

    //String
    val stringExample: String = "Sebastián__@//∟"

    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false

    println(booleanExample)
    println(stringExample)

    /**
     * Varibales (var)
     */

    var nombre: String = "Juan"
    nombre = "Esteban"

    //Concatenar
    println("mi nombre es: $nombre y tengo $edad años")
}