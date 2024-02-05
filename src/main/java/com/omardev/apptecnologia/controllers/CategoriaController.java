package com.omardev.apptecnologia.controllers;

import com.omardev.apptecnologia.models.dto.CategoriaDTO;
import com.omardev.apptecnologia.models.entity.Categoria;
import com.omardev.apptecnologia.models.mapper.CategoriaMapper;
import com.omardev.apptecnologia.services.contracts.CategoriaDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categoria")
@ConditionalOnProperty(prefix = "app", name = "controller.enable-dto", havingValue = "true")
public class CategoriaController {
    private final CategoriaDAO service;
    @Autowired
    private CategoriaMapper mapper;
    @Autowired
    public CategoriaController(CategoriaDAO service) {
        this.service = service;

    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Categoria> categorias = service.getAll();
        if(!categorias.isEmpty()){
            List<CategoriaDTO> dtos = categorias.stream().map(mapper::categoriaDto).collect(Collectors.toList());
            return ResponseEntity.ok(dtos);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }



}
