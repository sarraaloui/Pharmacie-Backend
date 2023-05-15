package com.example.projj.Controller;

import com.example.projj.Services.Facture_Service;
import com.example.projj.entities.Facture;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facture")
@AllArgsConstructor
public class Facture_Controller {

    private final Facture_Service facture_service;
    @PostMapping("/create")
    public Facture create(Facture facture){
        return facture_service.creer(facture);
    }



    }

