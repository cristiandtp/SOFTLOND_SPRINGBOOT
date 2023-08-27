package com.miEmpresa.newstore.services.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.miEmpresa.newstore.entities.Categoria;
import com.miEmpresa.newstore.repositories.contrato.ICatergoriaRepository;
import com.miEmpresa.newstore.services.contract.ICategoriaService;

@Service
public class CategoriaServicio implements ICategoriaService{

    @Autowired
    private ICatergoriaRepository categoryRepository;

    @Override
    public ResponseEntity<List<Categoria>> obtener() {
        //compruebo conexion BD
        ResponseEntity<List<Categoria>> response = new ResponseEntity<List<Categoria>>(HttpStatus.OK);
        try {
           List<Categoria> listaCategoria = this.categoryRepository.findAll();
           response = new ResponseEntity<List<Categoria>>(listaCategoria, HttpStatus.OK);
           return response;
        } catch (Exception e) {
            // TODO: handle exception
            response = new ResponseEntity<List<Categoria>>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
    public ResponseEntity<Categoria> crear(Categoria categoria) {
        ResponseEntity<Categoria> response = new ResponseEntity<Categoria>(HttpStatus.OK);
        try {
            Categoria categori = this.categoryRepository.save(categoria);
            response = new ResponseEntity<Categoria>(categori, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<Categoria>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
    public ResponseEntity<Categoria> actualizar(Categoria categoria) {
        ResponseEntity<Categoria> response = new ResponseEntity<Categoria>(HttpStatus.OK);
        try {
            Categoria categori = this.categoryRepository.save(categoria);
            response = new ResponseEntity<Categoria>(categori,HttpStatus.OK);
            return response; 
        } catch (Exception e) {
            response = new ResponseEntity<Categoria>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
    public ResponseEntity<Boolean> borrar(Long id) {
         //verifico conexion BD
         ResponseEntity<Boolean> response = new ResponseEntity<Boolean>(HttpStatus.OK);
         //try cach
         try {
             this.categoryRepository.deleteById(id);
             response = new ResponseEntity<Boolean>(true, HttpStatus.OK);
             return response;
         } catch (Exception e) {
             // TODO: handle exception
             response = new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
             return response;
         }
     }
}

