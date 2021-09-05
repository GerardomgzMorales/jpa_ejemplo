package mx.historial.com.gestor

import mx.historial.com.model.Persona
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

class GestorPersitance {

    private var facManager: EntityManagerFactory? = null

    init {
        this.facManager = Persistence.createEntityManagerFactory("ejemploKotlinJPA")
    }

    fun obtenerPersona(id: Long): Persona? {
        val em: EntityManager? = facManager?.createEntityManager()
        val persona: Persona? = em?.find(Persona::class.java, id)
        em?.clear()
        em?.close()
        return persona
    }

    fun cerrarEntity() {
        facManager?.close()
    }


}