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
        persona.direccion = Direccion("Toreo 22", "Tlanepantla", "CDMX", 7845)
        persona.nombre = "Antonio Aguilar"
        persona.fecha = GregorianCalendar(1930, 11, 3).time
        return persona
    }

}

fun main() {
    val mge = ManagerEntity()
    val gestor = GestorPersitance()

    //gestor.crearPersona(mge.crearNuevaPersona())

    var np = gestor.buscarPorIDPersona(1)
    if (np != null) {
        np = mge.actualizacion(np)
        println("\n Persona Actualizada: $np")
        gestor.actualizarPersonas(np)
        println("\n Persona Actualizada ${np.id?.let { gestor.buscarPorIDPersona(it) }}")
    }


    gestor.cerrarEntity()
}