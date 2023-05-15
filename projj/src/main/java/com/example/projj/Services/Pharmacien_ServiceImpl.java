package com.example.projj.Services;

import com.example.projj.Repository.Pharmacien_Repository;
import com.example.projj.entities.Pharmacien;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class Pharmacien_ServiceImpl implements Pharmacien_Service{
    private Pharmacien_Repository pharmacien_repository;

    @Override
    public Pharmacien creer(Pharmacien pharmacien) {
        return pharmacien_repository.save(pharmacien);
    }

    @Override
    public Pharmacien modifier(Long id, Pharmacien pharmacien) {
        Pharmacien existing_user= pharmacien_repository.findById(id).orElse(null);
        existing_user.setAdresse_util(pharmacien.getAdresse_util());
        existing_user.setCodepostal_util(pharmacien.getCodepostal_util());
        existing_user.setEmail_util(pharmacien.getEmail_util());
        existing_user.setNom_util(pharmacien.getNom_util());
        existing_user.setPrenom_util(pharmacien.getPrenom_util());
        existing_user.setDateNaissance_util(pharmacien.getDateNaissance_util());
        return pharmacien_repository.save(existing_user);    }
    public Pharmacien getId_util(Long id_util){
        return pharmacien_repository.findById(id_util).orElse(null);
    }
    @Override
    public Pharmacien supprimer(Long id) {
        Pharmacien existing_user= pharmacien_repository.findById(id).orElse(null);
        pharmacien_repository.deleteById(existing_user.getId_util());
        return existing_user ;
    }
}
    /*
    @Autowired


    public Pharmacien save(Pharmacien pharmacien){
        return pharmacien_repository.save(pharmacien);
    }

    public List<Pharmacien> saveAll(List <Pharmacien> pharmaciens){
        return pharmacien_repository.saveAll(pharmaciens);
    }
    public Pharmacien getId_util(Long id_util){
        return pharmacien_repository.findById(id_util).orElse(null);
    }

    public Pharmacien delete_user(Long id){

        Pharmacien existing_user= pharmacien_repository.findById(id).orElse(null);
        pharmacien_repository.deleteById(existing_user.getId_util());
        return existing_user;
    }
    public Pharmacien modify(Long id, Pharmacien user){
        Pharmacien existing_user= pharmacien_repository.findById(id).orElse(null);
        existing_user.setAdresse_util(user.getAdresse_util());
        existing_user.setCodepostal_util(user.getCodepostal_util());
        existing_user.setEmail_util(user.getEmail_util());
        existing_user.setNom_util(user.getNom_util());
        existing_user.setPrenom_util(user.getPrenom_util());
        existing_user.setDateNaissance_util(user.getDateNaissance_util());
        return pharmacien_repository.save(existing_user);
    }
}*/
