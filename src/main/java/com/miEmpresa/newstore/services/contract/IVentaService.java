package com.miEmpresa.newstore.services.contract;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.miEmpresa.newstore.entities.Venta;

public interface IVentaService {
    //ACA LOS METODOS QUE SE NECESITAN PARA EL CRUD
    ResponseEntity<List<Venta>> getAll();
    ResponseEntity<Venta> crearVenta(Venta venta);
    ResponseEntity<Venta> actualizarVenta(Venta venta);
    ResponseEntity<Boolean> borrarVenta(Long id);
}
