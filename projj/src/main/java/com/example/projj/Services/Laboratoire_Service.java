package com.example.projj.Services;

import com.example.projj.entities.Laboratoire;

import java.util.List;

public interface Laboratoire_Service {
    Laboratoire creer(Laboratoire laboratoire);
    List<Laboratoire> lire();
    Laboratoire modifier(Long id_labo,Laboratoire laboratoire);
    Laboratoire supprimer(Long id_labo);
}
