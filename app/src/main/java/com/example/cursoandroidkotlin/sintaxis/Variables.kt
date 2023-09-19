package com.example.cursoandroidkotlin.sintaxis

const val edad: Int = 21 //global - fuera de las funciones

fun main() {
    println("Valores(Constantes) - Variables:")
    //variablesNumericas()
    //variablesBoolean()
    //variablesAlfanumericas()
    showMyAge(21)
    showMyAge() //No se envían variables - se agarra la variable por defecto
    showMyName("Sebastián")
    println(resta(8,4))
}

fun variablesAlfanumericas() {
    /**
     * Valores alfanuméricas
     */

    //Char (un solo caracter)
    val charExample: Char = 'c'
    val charExample2: Char = '@'
    val charExample3: Char = '3'

    //String
    val stringExample: String = "Sebastián__@//∟"

    println(stringExample)

    /**
     * Varibales (var)
     */

    var nombre: String = "Juan"
    nombre = "Esteban"

    //Concatenar
    println("mi nombre es: $nombre y tengo $edad años")
}

fun variablesBoolean() {
    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    println(booleanExample)
}

fun variablesNumericas() {
    /**
     * Valores Numéricas
     */

    //Long - a partir de acá el uso de memoria se incrementa
    val edadLong: Long = 21

    //float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 30.5
}

/**
 * Se pueden declarar valores por defecto,
 * para ser usados en caso se llame a la función y
 * no manden los parámetros
 */
fun showMyAge(age: Int = 1) {
    println("mi edad es $age")
}

fun showMyName(name: String) {
    println("mi nombre es $name")
}

fun resta(primerNumero: Int, segundoNumero: Int): Int {
    return primerNumero - segundoNumero
}