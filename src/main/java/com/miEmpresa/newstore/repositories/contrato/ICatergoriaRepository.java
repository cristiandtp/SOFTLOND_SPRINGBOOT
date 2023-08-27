package com.miEmpresa.newstore.repositories.contrato;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miEmpresa.newstore.entities.Categoria;

public interface ICatergoriaRepository extends JpaRepository<Categoria,Long>{
    
}
