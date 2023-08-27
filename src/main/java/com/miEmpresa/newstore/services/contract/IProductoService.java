package com.miEmpresa.newstore.services.contract;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.miEmpresa.newstore.entities.Producto;

public interface IProductoService {
    //ACA LOS METODOS QUE SE NECESITAN PARA EL CRUD
    public ResponseEntity<List<Producto>> getAll();
    public ResponseEntity<Producto> postProduct(Producto producto);
    public ResponseEntity<Producto> updateProduct(Producto producto);
    public ResponseEntity<Boolean> deleteProduct(Long id);
}
