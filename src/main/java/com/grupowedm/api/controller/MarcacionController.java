package com.grupowedm.api.controller;

import com.grupowedm.api.entity.Marcacion;
import com.grupowedm.api.repository.MarcacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcaciones")
@CrossOrigin(origins = "*")
public class MarcacionController {

    @Autowired
    private MarcacionRepository marcacionRepository;

    @GetMapping
    public List<Marcacion> listarTodas() {
        return marcacionRepository.findAll();
    }

    @PostMapping
    public Marcacion guardar(@RequestBody Marcacion marcacion) {
        // Nota: Asegúrate de que el JSON enviado incluya los IDs de Empleado y Op si son necesarios
        return marcacionRepository.save(marcacion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marcacion> obtenerPorId(@PathVariable Long id) {
        return marcacionRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (marcacionRepository.existsById(id)) {
            marcacionRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}