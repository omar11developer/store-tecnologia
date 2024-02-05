package com.omardev.apptecnologia.repository;

import com.omardev.apptecnologia.models.entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

    public List<Categoria> findByEstadoTrueOrderByIdCategoria();

}
