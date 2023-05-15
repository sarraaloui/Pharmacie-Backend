package com.example.projj.Services;

import com.example.projj.Repository.Fournisseur_Repository;
import com.example.projj.entities.Fournisseur;
import com.example.projj.entities.Laboratoire;
import com.example.projj.entities.Pharmacien;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Fournisseur_ServiceImpl implements Fournisseur_Service {


    private Fournisseur_Repository fournisseur_repository;

    @Override
    public List<Fournisseur> lire() {
        return fournisseur_repository.findAll();

    }

    @Override
    public Fournisseur creer(Fournisseur fournisseur) {
         return fournisseur_repository.save(fournisseur);
    }

    @Override
    public Fournisseur consulter(Long id_frn) {
        Fournisseur existing_user= fournisseur_repository.findById(id_frn).orElse(null);
        return existing_user;
    }


    @Override
    public Fournisseur modifier(Long id_frn, Fournisseur fournisseur) {
        Fournisseur existing_user= fournisseur_repository.findById(id_frn).orElse(null);
        existing_user.setAdresse_fournisseur(fournisseur.getAdresse_fournisseur());
        existing_user.setEmail_fournisseur(fournisseur.getEmail_fournisseur());
        existing_user.setNom_fournisseur(fournisseur.getNom_fournisseur());
        existing_user.setTel_fournisseur(fournisseur.getTel_fournisseur());
        return fournisseur_repository.save(existing_user);    }

    @Override
    public Fournisseur supprimer(Long id_frn) {
        Fournisseur existing_user= fournisseur_repository.findById(id_frn).orElse(null);
        fournisseur_repository.deleteById(id_frn);
        return existing_user ;    }
}
