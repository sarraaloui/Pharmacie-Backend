package com.example.projj.Services;

import com.example.projj.Repository.Labortaoire_Repository;
import com.example.projj.entities.Laboratoire;
import com.example.projj.entities.Pharmacien;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Laboratoire_ServiceImpl implements Laboratoire_Service {
    private final Labortaoire_Repository labortaoire_repository;
    @Override
    public Laboratoire creer(Laboratoire laboratoire) {
        return labortaoire_repository.save(laboratoire);
    }

    @Override
    public List<Laboratoire> lire() {
        return labortaoire_repository.findAll();
    }

    @Override
    public Laboratoire modifier(Long id_labo, Laboratoire laboratoire) {
        return labortaoire_repository.findById(id_labo)
                .map(f->
                {f.setId_labo(laboratoire.getId_labo());
                    f.setLib_labo(laboratoire.getLib_labo());
                    return labortaoire_repository.save(f);
                }).orElseThrow(()->new RuntimeException("laboratoire n'existe pas"));
    }

    @Override
    public Laboratoire supprimer(Long id_labo) {
       /* labortaoire_repository.deleteById(id_labo);
        return "laboratoire supprimée avec succes" ;*/
        Laboratoire existing_user= labortaoire_repository.findById(id_labo).orElse(null);
        labortaoire_repository.deleteById(id_labo);
        return existing_user ;
    }
}
