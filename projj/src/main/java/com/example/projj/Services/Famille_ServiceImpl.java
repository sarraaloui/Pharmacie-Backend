package com.example.projj.Services;

import com.example.projj.Repository.Famille_Repository;
import com.example.projj.entities.Famille;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class Famille_ServiceImpl implements Famille_Service {
    private final Famille_Repository famille_repository;

    @Override
    public Famille creer(Famille famille) {
        return famille_repository.save(famille);

    }

    @Override
    public List<Famille> lire() {
        return famille_repository.findAll();
    }

    @Override
    public Famille modifier(Long id_famille, Famille famille) {

        return famille_repository.findById(id_famille)
                .map(f->
                {f.setId_famille(famille.getId_famille());
                    f.setLib_famille(famille.getLib_famille());
                  return famille_repository.save(f);
                }).orElseThrow(()->new RuntimeException("famille n'existe pas"));
    }

    @Override
    public Famille supprimer(Long id_famille) {
        Famille existing_user= famille_repository.findById(id_famille).orElse(null);
        famille_repository.deleteById(id_famille);
        return existing_user ;
    }
}
