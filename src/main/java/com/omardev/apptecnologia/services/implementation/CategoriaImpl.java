package com.omardev.apptecnologia.services.implementation;

import com.omardev.apptecnologia.models.entity.Categoria;
import com.omardev.apptecnologia.repository.CategoriaRepository;
import com.omardev.apptecnologia.services.contracts.CategoriaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaImpl implements CategoriaDAO {

    private final CategoriaRepository repository;

    @Autowired
    public CategoriaImpl(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Categoria> getAll() {
        return (List<Categoria>) repository.findAll();
    }

    @Override
    public List<Categoria> findByEstadoTrueOrderByIdCategoria() {
        return repository.findByEstadoTrueOrderByIdCategoria();
    }

    @Override
    public Optional<Categoria> findById(Integer idCategoria) {
        return Optional.of(repository.findById(idCategoria)).orElse(null);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public boolean exists(int idCategoria) {
        return repository.existsById(idCategoria);
    }

    @Override
    public void deleteById(Integer idCategoria) {

    }
}
