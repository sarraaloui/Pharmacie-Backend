package com.example.projj.Controller;

import com.example.projj.Services.Fournisseur_Service;

import com.example.projj.entities.Famille;
import com.example.projj.entities.Fournisseur;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
@AllArgsConstructor
public class Fournisseur_Controller {
    private final Fournisseur_Service fournisseur_service;

    @GetMapping("/read")
    public List<Fournisseur> read() {
        return fournisseur_service.lire();
    }

    @PostMapping("/create")
    public Fournisseur create(@RequestBody Fournisseur fournisseur) {
        return fournisseur_service.creer(fournisseur);
    }

    @PutMapping("/update/{id_frn}")
    public Fournisseur update(@PathVariable Long id_frn, @RequestBody Fournisseur fournisseur) {
        return fournisseur_service.modifier(id_frn, fournisseur);
    }
    @DeleteMapping("/delete/{id_frn}")
    public Fournisseur delete(@PathVariable Long id_frn){
        return fournisseur_service.supprimer(id_frn);
    }

    @GetMapping("/read/{id_frn}")
    public Fournisseur read(@PathVariable Long id_frn) {
        return fournisseur_service.consulter(id_frn);
    }



}
