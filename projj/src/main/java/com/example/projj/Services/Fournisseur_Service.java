package com.example.projj.Services;

import com.example.projj.entities.Famille;
import com.example.projj.entities.Fournisseur;

import java.util.List;

public interface Fournisseur_Service {

    List<Fournisseur> lire();
    Fournisseur creer(Fournisseur fournisseur);
    Fournisseur consulter(Long id_frn);
    Fournisseur modifier(Long id_rn,Fournisseur fournisseur);
    Fournisseur supprimer(Long id_frn);
}
