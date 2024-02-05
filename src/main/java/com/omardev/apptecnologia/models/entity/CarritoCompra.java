package com.omardev.apptecnologia.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "carrito_compra")
@Getter
@Setter
@NoArgsConstructor
public class CarritoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden", nullable = false)
    private Integer idOrder;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime fecha;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double total;

    @Column(name = "metodo_pago", nullable = false, columnDefinition = "CHAR(1)")
    private String metodoPago;

    @Column(name = "nota_adicional", length = 200)
    private String notaAdicional;

    @Column(name = "id_cliente", nullable = false)
    private Integer idCliente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "orden", fetch = FetchType.EAGER)
    private List<CarritoItems> items;



}
