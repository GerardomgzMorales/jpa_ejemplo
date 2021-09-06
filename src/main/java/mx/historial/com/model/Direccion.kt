package mx.historial.com.model


import lombok.AllArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "direcciones")
@AllArgsConstructor
class Direccion() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion", nullable = false)
    var idDireccion: Long? = null

    @Column(nullable = false, length = 50)
    var calle: String? = null

    @Column(nullable = false, length = 50)
    var municipio: String? = null

    @Column(nullable = false, length = 50)
    var estado: String? = null

    @Column(name = "codigo_postal", nullable = false)
    var codigoPostal: Int? = null

    constructor(calle: String, municipio: String, estado: String, codigoPostal: Int) : this() {
        this.calle = calle
        this.municipio = municipio
        this.estado = estado
        this.codigoPostal = codigoPostal
    }

    override fun toString(): String {
        return "Direccion(idDireccion=$idDireccion, calle=$calle, municipio=$municipio, estado=$estado, codigoPostal=$codigoPostal)"
    }


}