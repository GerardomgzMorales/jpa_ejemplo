package mx.historial.com.gestor

import mx.historial.com.model.Persona
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

class GestorPersitance : ICrudPersona {

    private var facManager: EntityManagerFactory? = null
    private var em: EntityManager? = null

    init {
        this.facManager = Persistence.createEntityManagerFactory("ejemploKotlinJPA")
    }


    fun cerrarEntity() {
        facManager?.close()
    }

    override fun crearPersona(persona: Persona): Boolean {
        this.em = facManager?.createEntityManager()
        val entTran = this.em?.transaction
        entTran?.begin()
        this.em?.persist(persona)
        return try {
            println("\nPersonas creada.\n")
            entTran?.commit()
            true
        } catch (ex: Exception) {
            println("\n El error es: ${ex.message} \n")
            ex.printStackTrace()
            false
        } finally {
            this.em?.close()
        }
    }

    override fun buscarPorIDPersona(id: Long): Persona? {
        this.em = facManager?.createEntityManager()
        val persona: Persona? = em?.find(Persona::class.java, id)
        em?.close()
        return persona
    }

    override fun listarPersonas(): List<Persona>? {
        this.em = facManager?.createEntityManager()
        val listado = this.em?.createQuery("select c from Persona c")?.resultList as List<Persona>?
        this.em?.close()
        return listado
    }


}