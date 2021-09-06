package mx.historial.com.manager

import mx.historial.com.gestor.GestorPersitance
import mx.historial.com.model.Direccion
import mx.historial.com.model.Persona
import java.util.*

class ManagerEntity {
    fun crearNuevaPersona(): Persona {
        val persona = Persona()
        persona.direccion = Direccion("Toreo 22", "Naucalpan", "EDOmEX", 3222)
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

    fun actualizacion(persona: Persona): Persona {
        val np = persona
        np.nombre = "Carolina Perez"
        np.fecha = GregorianCalendar(1995, 10, 3).time
        return np
    }

}

fun main() {
    val mge = ManagerEntity()
    val gestor = GestorPersitance()

    // gestor.crearPersona(mge.crearNuevaPersona())

    println(gestor.buscarPorIDPersona(1))



    gestor.cerrarEntity()
}