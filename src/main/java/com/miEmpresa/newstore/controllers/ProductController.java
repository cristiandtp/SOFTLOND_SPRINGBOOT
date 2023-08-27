package com.miEmpresa.newstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.miEmpresa.newstore.entities.Producto;
import com.miEmpresa.newstore.services.contract.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductController {
    
    @Autowired
    private IProductoService productoService;

    @GetMapping("/listaProductos")
    private ResponseEntity<List<Producto>> getAll(){
        return this.productoService.getAll();
    }
    
    @PostMapping("/postProductos")
    //@RequestBody el internamente sabe que le va a llegar como json
    private ResponseEntity<Producto> postProduct(@RequestBody Producto producto){
        return this.productoService.postProduct(producto);
    }

    @PutMapping("/actualizaProducto")
    private ResponseEntity<Producto> updateProduct(@RequestBody Producto producto){
        return this.productoService.updateProduct(producto);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteProduct(Long id){
        return this.productoService.deleteProduct(id);
    }
}