package com.example.projj.Services;

import com.example.projj.entities.Famille;
import java.util.List;

public interface Famille_Service {
    Famille creer(Famille famille);
    List<Famille> lire();
    Famille modifier(Long id_famille,Famille famille);
    Famille supprimer(Long id_famille);
}
