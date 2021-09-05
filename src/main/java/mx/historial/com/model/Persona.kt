package mx.historial.com.model

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "personas")
class Persona : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(nullable = false, length = 50)
    val nombre: String? = null

    @Column(nullable = false, length = 50)
    val direccion: String? = null

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    val fecha: Date? = null

    @Column(unique = true, length = 20)
    val rfc: String? = null


    override fun toString(): String {
        return "Persona(id=$id, nombre=$nombre, direccion=$direccion, fecha=$fecha, rfc=$rfc)"
    }


}