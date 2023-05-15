package com.example.projj.Controller;

import com.example.projj.Services.Produit_Service;
import com.example.projj.entities.Famille;
import com.example.projj.entities.Fournisseur;
import com.example.projj.entities.Produit;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class Produit_Controller {


    private final Produit_Service produit_service ;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit) {
        return produit_service.creer(produit);
    }

    @GetMapping("/read")
    public List<Produit> read() {
        return produit_service.lire();
    }

    @PutMapping("/update/{id_prd}")
    public Produit update(@PathVariable Long id_prd, @RequestBody Produit produit) {
        return produit_service.modifier(id_prd, produit);
    }
    @GetMapping("/readp/{id_prd}")
    public Produit readp(@PathVariable("id_prd") Long id_prd) {

        return produit_service.consulter(id_prd);
    }

    @GetMapping("/readf/{rech}")
    public List <Produit> readf(@PathVariable String rech) {

        return   produit_service.findBymot(rech);
    }
    @GetMapping("/reada/{id_frn}")
    public List <Produit> reada(@PathVariable Long id_frn) {

        return  produit_service.findByfrn(id_frn);
    }
    @GetMapping("/readb/{id_lab}")
    public List <Produit> readb(@PathVariable Long id_lab) {

        return  produit_service.findBylab(id_lab);
    }
    @GetMapping("/readd/{id_famille}")
    public List <Produit> readd(@PathVariable Long id_famille) {

        return  produit_service.findByfam(id_famille);
    }
}
