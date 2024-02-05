package com.omardev.apptecnologia.models.mapper;

import com.omardev.apptecnologia.models.dto.CategoriaDTO;
import com.omardev.apptecnologia.models.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "id"),
            @Mapping(source = "descripcion", target = "categoria"),
            @Mapping(source = "estado", target = "activo"),
    })
    CategoriaDTO categoriaDto(Categoria categoria);

    @InheritInverseConfiguration
    Categoria categoria(CategoriaDTO categoriaDTO);

}
