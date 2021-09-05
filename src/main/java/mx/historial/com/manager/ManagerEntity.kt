package mx.historial.com.manager

import mx.historial.com.gestor.GestorPersitance

class ManagerEntity

fun main() {

    val gestor = GestorPersitance()
    println(gestor.obtenerPersona(2))
    gestor.cerrarEntity()

}