package com.example.projj.Repository;

import com.example.projj.entities.Facture;
import com.example.projj.entities.Famille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Famille_Repository  extends JpaRepository<Famille, Long> {
}
