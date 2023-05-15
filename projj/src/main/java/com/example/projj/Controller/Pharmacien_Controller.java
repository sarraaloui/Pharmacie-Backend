package com.example.projj.Controller;


import com.example.projj.Services.Pharmacien_ServiceImpl;
import com.example.projj.entities.Pharmacien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pharmacien/")

public class Pharmacien_Controller {
    @Autowired
    private Pharmacien_ServiceImpl service_pharmacien;

    @PostMapping("/Add_User")
    public Pharmacien ajout_util(@RequestBody Pharmacien pharmacien){
        return service_pharmacien.creer(pharmacien) ;
    }

    @PutMapping("/update/{id}")
    public Pharmacien modify_pharmacien(@PathVariable Long id,@RequestBody Pharmacien pharmacien){
        return service_pharmacien.modifier(id,pharmacien);
    }
    @DeleteMapping("/delete/{id}")
    public Pharmacien delete_user(@PathVariable Long id ){
        return service_pharmacien.supprimer(id);
    }

}
