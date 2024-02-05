package com.omardev.apptecnologia.models.entity;

import com.omardev.apptecnologia.models.audit.AuditaleEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditaleEntity.class)
public class Producto extends AuditaleEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prodcuto", nullable = false)
    private Integer idProducto;

    @Column(nullable = false, length = 200)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String marca;

    @Column(name = "precio_venta", nullable = false, columnDefinition = "Decimal(5,2)")
    private Double precioVenta;

    @Column(name = "precio_oferta", columnDefinition = "Decimal(5,2)")
    private Double precioOferta;

    @Column(name = "codigo_barra", nullable = false, length = 30)
    private String codigoBarra;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(columnDefinition = "TINYINT", nullable = false)
    private Boolean estado;

    @Column(name = "is_oferta", columnDefinition = "TINYINT")
    private Boolean isOferta;

    @Column(name = "oferta_aplicada")
    private Integer ofertaAplicada;

    @Column(name = "sub_categoria", nullable = false,length = 45)
    private String subCategoria;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

}
