package com.miEmpresa.newstore.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.miEmpresa.newstore.entities.Producto;
import com.miEmpresa.newstore.repositories.contrato.IProductoRepositories;
import com.miEmpresa.newstore.services.contract.IProductoService;

@Service
public class ProductService implements IProductoService{
    
    //esto es como el constructor
    @Autowired
    private IProductoRepositories productoRepositories;
    @Override
    public ResponseEntity<List<Producto>> getAll() {
        //ResponseEntity va a ser una conxion con la BD y la respuesta debe ser exitosa
        ResponseEntity<List<Producto>> response = new ResponseEntity<List<Producto>>(HttpStatus.OK);
        try {
            //si todo esta bien creamos una lista para guardar todos los productos
            List<Producto> listaProductos = this.productoRepositories.findAll();
            response = new ResponseEntity<List<Producto>>(listaProductos, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<List<Producto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;    
        }
    }

    @Override
    public ResponseEntity<Producto> postProduct(Producto producto) {
        ResponseEntity<Producto> response = new ResponseEntity<Producto>(HttpStatus.OK);
        try {
            Producto produc = this.productoRepositories.save(producto);
            response = new ResponseEntity<Producto>(produc, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
    public ResponseEntity<Producto> updateProduct(Producto producto) {
        ResponseEntity<Producto> response = new ResponseEntity<Producto>(HttpStatus.OK);
        try {
            Producto product = this.productoRepositories.save(producto);
            response = new ResponseEntity<Producto>(product,HttpStatus.OK);
            return response; 
        } catch (Exception e) {
            response = new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
    public ResponseEntity<Boolean> deleteProduct(Long id) {
        //verifico conexion BD
        ResponseEntity<Boolean> response = new ResponseEntity<Boolean>(HttpStatus.OK);
        //try cach
        try {
            this.productoRepositories.deleteById(id);
            response = new ResponseEntity<Boolean>(true, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            // TODO: handle exception
            response = new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }
    
}
