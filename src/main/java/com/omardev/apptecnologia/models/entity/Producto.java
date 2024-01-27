package com.omardev.apptecnologia.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prodcuto", nullable = false)
    private Integer idProducto;

    @Column(nullable = false, length = 30)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String marca;

    @Column(name = "precio_venta", nullable = false, columnDefinition = "Decimal(5,2)")
    private Double precioVenta;

    @Column(name = "codigo_barra", nullable = false, length = 30)
    private String codigoBarra;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(columnDefinition = "TINYINT", nullable = false)
    private Boolean estado;



}
