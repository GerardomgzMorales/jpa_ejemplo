package mx.historial.com.gestor

import mx.historial.com.model.Persona

interface ICrudPersona {
    fun crearPersona(persona: Persona): Boolean
    fun buscarPorIDPersona(id: Long): Persona?
    fun listarPersonas(): List<Persona>?
    fun actualizarPersonas(persona: Persona): Boolean
    fun borrarPersona(persona: Persona): Boolean
}