package mx.historial.com.manager

import mx.historial.com.model.Persona
import javax.persistence.Persistence

class ManagerEntity {

}

fun main() {
    val facManager = Persistence.createEntityManagerFactory("ejemploKotlinJPA") //lee la config y sabe como crear
    val em = facManager.createEntityManager()

    println((em.find(Persona::class.java, "1".toLong()) as Persona))


}