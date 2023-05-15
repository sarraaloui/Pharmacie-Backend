package com.example.projj.Services;

import com.example.projj.Repository.Commande_prdRepository;
import com.example.projj.entities.Commande_prd;
import com.example.projj.entities.Facture;
import com.example.projj.entities.Famille;

import java.util.List;

public interface Commandeprd_Service {
    Commande_prd creer(Commande_prd commande_prd);

    List<Commande_prd> lire();
}
