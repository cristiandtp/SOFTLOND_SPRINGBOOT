package com.miEmpresa.newstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miEmpresa.newstore.entities.Categoria;
import com.miEmpresa.newstore.services.contract.ICategoriaService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/obtener")
    private ResponseEntity<List<Categoria>> obtener(){
        return this.categoriaService.obtener();
    }

    @PostMapping("/crear")
    private ResponseEntity<Categoria> crear(@RequestBody Categoria categoria){
        return this.categoriaService.crear(categoria);
    }

    @PutMapping("/actualizar")
    private ResponseEntity<Categoria> actualizar(@RequestBody Categoria categoria){
        return this.categoriaService.actualizar(categoria);
    }

    @DeleteMapping("/borrar")
    private ResponseEntity<Boolean> borrar(Long id){
        return this.categoriaService.borrar(id);
    }
}

    



