package com.example.cursoandroidkotlin.ejercicios

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    println("El precio del ticket para una persona de $child años es S/.${precioTicket(child, true)}")
    println("El precio del ticket para una persona de $adult años es S/.${precioTicket(adult, false)}")
    println("El precio del ticket para una persona de $senior años es S/.${precioTicket(senior, true)}")
    println(mostrarCantidadNotificaciones(150))
}

/**
 * Mostrar cantidad de notificaciones
 * Resumen de cantidad de notificaciones
 * 1.- Cantidad exacta cuando sean menos de 100
 * 2.- 99+ cuando sean mayor a 100
 */
fun mostrarCantidadNotificaciones(cantNotificaciones: Int): String {
    return if (cantNotificaciones < 100) {
        cantNotificaciones.toString();
    } else {
        "99+"
    }
}

/**
 * Precio entrada de cine
 * Niños (12 años o menos) = S/.15
 * Adultos (13 - 60) = s/.30, si es lunes se aplicará descuento y el precio será S/.25
 * Adultos mayores (61 - 100) = S/.20
 * Si la edad está fuera del rango = -1
 */
fun precioTicket(edad: Int, esLunes: Boolean): Int {
    return when (edad) {
        in 0..12 -> 15
        in 13..60 -> if (esLunes) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}