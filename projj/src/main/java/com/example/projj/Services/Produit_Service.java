package com.example.projj.Services;

import com.example.projj.entities.Produit;

import java.util.List;

public interface Produit_Service {
    Produit creer(Produit produit);


    Produit consulter(Long id_prd);
    Produit modifier(Long id_prd,Produit produit);

    List<Produit> lire();
    List<Produit> findBymot(String rech);

    List<Produit> findByfrn(Long  id_frn);

    List<Produit> findBylab(Long id_lab);

    List<Produit> findByfam(Long id_famille);


}
