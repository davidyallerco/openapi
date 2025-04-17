package net.yallerco.openapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import net.yallerco.openapi.api.SaludoApi;

@RestController
public class SaludoController implements SaludoApi {

    @Override
    public ResponseEntity<String> getSaludo() {
        return ResponseEntity.ok("¡Hola desde Contract-First!");
    }
}