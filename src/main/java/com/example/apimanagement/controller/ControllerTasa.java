package com.example.apimanagement.controller;

import com.example.apimanagement.model.Tasa;
import com.example.apimanagement.service.ServiceTasa;
import com.example.apimanagement.service.ServiceTasaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasas")
public class ControllerTasa {

    private final ServiceTasaImpl serviceTasa;

    @Autowired
    public ControllerTasa(ServiceTasaImpl serviceTasa) {
        this.serviceTasa = serviceTasa;
    }

    @RequestMapping
    public ResponseEntity<Object> getTasa() {
        return new ResponseEntity<>(serviceTasa.getAllTasas(), HttpStatus.OK);
    }
    @PostMapping
    private Tasa addTasa(@RequestBody Tasa tasa){
        System.out.println(tasa.toString());
        serviceTasa.insertTasa(tasa);
        return serviceTasa.insertTasa(tasa);
    }
    @PutMapping
    public ResponseEntity<Object> updateTasa(@RequestBody Tasa tasa) {
        System.out.println(tasa.toString());
        if (serviceTasa.getTasa(tasa.getId()).isPresent())
            serviceTasa.updateTasa(tasa);
        else return new ResponseEntity<>("Not exist id of tasa", HttpStatus.NOT_MODIFIED);
        return new ResponseEntity<>("Tasa was updated successsfully", HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<Object> deleteTasa(@PathVariable("id") Long id){
        serviceTasa.deleteTasa(id);
        return new ResponseEntity<>("Alumno is deleted successsfully", HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<Object> getAlumno(@PathVariable("id") Long id){
        return new ResponseEntity<>(serviceTasa.getTasa(id), HttpStatus.OK);
    }

}
