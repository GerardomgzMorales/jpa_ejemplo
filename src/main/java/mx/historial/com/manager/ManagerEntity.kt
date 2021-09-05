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

    fun actualizacion(persona: Persona): Persona {
        val np = persona
        np.nombre = "Carolina Perez"
        np.fecha = GregorianCalendar(1995, 10, 3).time
        println("antes de actualizar es: $np")
        return np
    }

}

fun main() {

    val mge = ManagerEntity()
    val gestor = GestorPersitance()


    println(gestor.crearPersona(mge.crearNuevaPersona()))

    val np = gestor.buscarPorIDPersona(1)
    println("\n $np \n")

    gestor.listarPersonas()?.let { mge.mostrarPersonas(it) }

    println(gestor.actualizarPersonas(mge.actualizacion(np!!)))

    gestor.listarPersonas()?.let { mge.mostrarPersonas(it) }


    gestor.cerrarEntity()

}