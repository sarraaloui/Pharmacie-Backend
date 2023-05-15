package com.example.projj.Services;

import com.example.projj.entities.Pharmacien;

public interface Pharmacien_Service {

    Pharmacien creer(Pharmacien pharmacien);
    Pharmacien modifier(Long id,Pharmacien pharmacien);
    Pharmacien supprimer(Long id);
}
