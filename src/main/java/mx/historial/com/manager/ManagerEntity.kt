package mx.historial.com.manager

import mx.historial.com.gestor.GestorPersitance
import mx.historial.com.model.Persona
import java.util.*

class ManagerEntity {
    fun crearNuevaPersona(): Persona {
        val persona = Persona()
        persona.direccion = "Cuautitlan Izaclli"
        persona.fecha = Date()
        persona.rfc = "hjuefuy3e33"
        persona.nombre = "Pedro Soto Cacho"
        return persona
    }

    fun mostrarPersonas(listado: List<Any>) {
        println("\nPersonas en la DB \n")
        for (psr in listado) {
            println(psr.toString())
        }
    }
}

fun main() {

    val mge = ManagerEntity()
    val gestor = GestorPersitance()


    println(gestor.buscarPorIDPersona(2))
    println(gestor.crearPersona(mge.crearNuevaPersona()))
    gestor.listarPersonas()?.let { mge.mostrarPersonas(it) }


    gestor.cerrarEntity()

}