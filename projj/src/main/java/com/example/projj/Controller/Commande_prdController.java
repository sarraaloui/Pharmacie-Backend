package com.example.projj.Controller;

import com.example.projj.Services.Commandeprd_Service;
import com.example.projj.entities.Commande_prd;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commande_prd")
@AllArgsConstructor
public class Commande_prdController {
    private final Commandeprd_Service commandeprd_service ;


    @PostMapping("/create")
    public Commande_prd create(@RequestBody Commande_prd commande_prd) {
        return commandeprd_service.creer(commande_prd);
    }

    @GetMapping("/read")
    public List<Commande_prd> read() {
        return commandeprd_service.lire();
    }
}
