package mx.historial.com.model


import java.util.*
import javax.persistence.*

@Entity
@Table(name = "personas")
open class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(nullable = false)
    val nombre: String? = null

    @Column(nullable = false)
    val direccion: String? = null

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    val fecha: Date? = null

    override fun toString(): String {
        return "Persona(id=$id, nombre=$nombre, direccion=$direccion, fecha=$fecha)"
    }

}