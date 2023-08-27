package com.miEmpresa.newstore.services.contract;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.miEmpresa.newstore.entities.Categoria;


public interface ICategoriaService {
    public ResponseEntity<List<Categoria>> obtener();
    public ResponseEntity<Categoria> crear(Categoria categoria);
    public ResponseEntity<Categoria> actualizar(Categoria categoria);
    public ResponseEntity<Boolean> borrar(Long id);
}

