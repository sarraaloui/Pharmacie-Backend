package com.example.projj.Controller;


import com.example.projj.Services.Laboratoire_Service;
import com.example.projj.entities.Laboratoire;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratoire")
@AllArgsConstructor
public class Laboratoire_Controller {
    private final Laboratoire_Service laboratoire_service ;


    @PostMapping("/create")
    public Laboratoire create(@RequestBody Laboratoire laboratoire) {
        return laboratoire_service.creer(laboratoire);
    }

    @GetMapping("/read")
    public List<Laboratoire> read() {
        return laboratoire_service.lire();
    }

    @PutMapping("/update/{id_labo}")
    public Laboratoire update(@PathVariable Long id_labo,@RequestBody Laboratoire laboratoire) {
        return laboratoire_service.modifier(id_labo, laboratoire);
    }
    @DeleteMapping("/delete/{id_labo}")
    public Laboratoire delete(@PathVariable Long id_labo){
        return laboratoire_service.supprimer(id_labo);
    }

}
