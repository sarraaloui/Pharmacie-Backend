package com.example.projj.Services;

import com.example.projj.Repository.Facture_Repository;
import com.example.projj.entities.Facture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Facture_ServiceImpl implements Facture_Service {
   private final Facture_Repository facture_repository;
    @Override
    public Facture creer(Facture facture) {
        return facture_repository.save(facture);
    }
}
