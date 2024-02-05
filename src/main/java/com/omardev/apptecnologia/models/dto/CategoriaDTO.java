package com.omardev.apptecnologia.models.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO {
    private Integer id;
    private String categoria;
    private boolean activo;
}
