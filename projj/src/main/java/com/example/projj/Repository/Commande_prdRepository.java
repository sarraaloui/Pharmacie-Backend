package com.example.projj.Repository;

import com.example.projj.entities.Commande_prd;
import com.example.projj.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Commande_prdRepository extends JpaRepository<Commande_prd, Long> {
}
