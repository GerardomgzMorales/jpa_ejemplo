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
    var nombre: String? = null

    @Column(nullable = false, length = 50)
    var direccion: String? = null

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    var fecha: Date? = null

    @Column(unique = true, length = 20)
    var rfc: String? = null


    override fun toString(): String {
        return "Persona(id=$id, nombre=$nombre, direccion=$direccion, fecha=$fecha, rfc=$rfc)"
    }


}