package com.example.projj.Services;

import com.example.projj.Repository.Produit_Repository;
import com.example.projj.entities.Produit;
import com.example.projj.entities.Laboratoire;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Produit_ServiceImpl implements Produit_Service{

    @Autowired
    private Produit_Repository produit_repository;


    @Override
    public Produit creer(Produit produit) {
        return produit_repository.save(produit)  ;  }

    @Override
    public Produit consulter(Long id_prd) {
        Produit existing_user= produit_repository.findById(id_prd).orElse(null);
        return existing_user;
    }

    @Override
    public Produit modifier(Long id_prd, Produit produit) {
        return produit_repository.findById(id_prd)
                .map(p->
                {p.setId_prd(produit.getId_prd());
                    p.setLib_prd(produit.getLib_prd());
                    p.setDescription_prd(produit.getDescription_prd());
                    p.setPrix_prd(produit.getPrix_prd());
                    p.setDateAjout_prd(produit.getDateAjout_prd());
                    p.setPrix_liv(produit.getPrix_liv());
                    return produit_repository.save(p);
                }).orElseThrow(()->new RuntimeException("produit n'existe pas"));  }





    @Override
    public List<Produit> lire() {
        return produit_repository.findAll();
    }



    @Override
    public List<Produit> findBymot(String rech) {
        if(rech!=null) {
            return produit_repository.findBymot(rech);
        }
        return produit_repository.findAll();
    }

    @Override
    public List<Produit> findByfrn(Long id_frn) {
        return produit_repository.findByfrn(id_frn);    }


    @Override
    public List<Produit> findBylab(Long id_lab) {
        return produit_repository.findBylab(id_lab);    }



    @Override
    public List<Produit> findByfam(Long id_famille) {
        return produit_repository.findByfam(id_famille);      }
}
