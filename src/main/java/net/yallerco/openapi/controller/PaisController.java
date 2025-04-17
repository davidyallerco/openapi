package net.yallerco.openapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import net.yallerco.openapi.api.PaisesApi;
import net.yallerco.openapi.model.Pais;
import net.yallerco.openapi.service.PaisService;

@RestController
public class PaisController implements PaisesApi {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }
    
    

    @Override
    public ResponseEntity<List<Pais>> listarTodos() {
        return ResponseEntity.ok(paisService.findAll());
    }
	
//	 @Override
//	    public ResponseEntity<List<Pais>> listarTodos() {
//	        // Ejemplo de datos simulados
//	        Pais pais1 = new Pais().id(1L).pais("Colombia").capital("Bogotá").codigo("COL");
//	        Pais pais2 = new Pais().id(2L).pais("Argentina").capital("Buenos Aires").codigo("ARG");
//
//	        return ResponseEntity.ok(Arrays.asList(pais1, pais2));
//	    }
}