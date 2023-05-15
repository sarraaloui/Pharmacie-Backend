package com.example.projj.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data //getter w setters
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor // constructeur avec tous les attributs
@Entity
@Table(name = "pharmacien")
public class Pharmacien {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_util;
    @Column(name = "nom_util",length = 30)
    private String nom_util;
    @Column(name = "prenom_util",length = 30)
    private String prenom_util;
    @Column(name = "adresse_util",length = 30)
    private String adresse_util;
    @Column(name = "email_util",length = 30,unique = true)
    private String email_util;
    @Column(name = "codepostal_util",length = 4)
    private int codepostal_util;
    @Column(name = "dateNaissance_util")
    private Date dateNaissance_util;

    @OneToMany(mappedBy = "pharmaciens",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Fournisseur> fournisseurs;

}
