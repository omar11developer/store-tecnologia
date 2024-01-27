package com.omardev.apptecnologia.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categorias")
@NoArgsConstructor
@Getter
@Setter
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;

    @Column(nullable = false, unique = true, length = 30)
    private String descripcion;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Boolean estado;

}
