package com.example.projj.Services;

import com.example.projj.Repository.Commande_prdRepository;
import com.example.projj.entities.Commande_prd;
import com.example.projj.entities.Famille;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Commande_prd_ServiceImpl implements Commandeprd_Service {

   private final Commande_prdRepository commande_prdRepository;

    @Override
    public Commande_prd creer(Commande_prd commande_prd) {
        return commande_prdRepository.save(commande_prd);
    }

    @Override
    public List<Commande_prd> lire() {
        return commande_prdRepository.findAll();
    }

}

