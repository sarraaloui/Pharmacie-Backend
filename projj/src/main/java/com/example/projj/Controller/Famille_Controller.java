package com.example.projj.Controller;

import com.example.projj.Services.Famille_Service;
import com.example.projj.entities.Famille;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/famille")
@AllArgsConstructor
public class Famille_Controller {
    private final Famille_Service famille_service ;

    @PostMapping("/create")
    public Famille create(@RequestBody Famille famille) {
        return famille_service.creer(famille);
    }

    @GetMapping("/read")
    public List<Famille> read() {
        return famille_service.lire();
    }

    @PutMapping("/update/{id_famille}")
    public Famille update(@PathVariable Long id_famille,@RequestBody Famille famille) {
        return famille_service.modifier(id_famille, famille);
    }
    @DeleteMapping("/delete/{id_famille}")
    public Famille delete(@PathVariable Long id_famille){
        return famille_service.supprimer(id_famille);
    }



}