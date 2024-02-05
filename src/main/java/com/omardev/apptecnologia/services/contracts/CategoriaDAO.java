package com.omardev.apptecnologia.services.contracts;

import com.omardev.apptecnologia.models.entity.Categoria;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CategoriaDAO {

    public List<Categoria> getAll();
    public List<Categoria> findByEstadoTrueOrderByIdCategoria();

    public Optional<Categoria> findById(Integer idCategoria);

    public Categoria save(Categoria categoria);

    public boolean exists(int idCategoria);

    void deleteById(Integer idCategoria);


}
