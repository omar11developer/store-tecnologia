package com.omardev.apptecnologia.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carrito_items")
@IdClass(OrderItemsId.class)
@Getter
@Setter
@NoArgsConstructor
public class CarritoItems {

    @Id
    @Column(name = "id_orden", nullable = false)
    private  Integer idOrder;
    @Id
    @Column(name = "id_item", nullable = false)
    private Integer idItem;
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;
    @Column(nullable = false)
    private Integer cantidad;
    @Column(nullable = false,columnDefinition = "DECIMAL(5,2)")
    private Double precio;

    @OneToOne
    @JoinColumn(name = "id_prodcuto", referencedColumnName = "id_prodcuto", insertable = false, updatable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_orden", referencedColumnName = "id_orden", insertable = false, updatable = false)
    private CarritoCompra orden;

}
