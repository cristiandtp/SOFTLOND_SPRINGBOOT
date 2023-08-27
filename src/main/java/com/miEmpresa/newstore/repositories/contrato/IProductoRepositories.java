package com.miEmpresa.newstore.repositories.contrato;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miEmpresa.newstore.entities.Producto;

//para heredar la interface del JPA
public interface IProductoRepositories extends JpaRepository<Producto,Long>{
    
}
