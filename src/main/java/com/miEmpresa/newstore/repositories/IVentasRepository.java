package com.miEmpresa.newstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miEmpresa.newstore.entities.Venta;

public interface IVentasRepository extends JpaRepository<Venta, Long> {
    
}
