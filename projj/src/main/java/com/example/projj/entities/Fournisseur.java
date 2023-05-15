package com.example.projj.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Data //getter w setters
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor // constructeur avec tous les attributs
@Entity
@Table(name = "Fournisseur")

public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_frn;
    @Column(name = "nom_fournisseur",length = 30)
    private String nom_fournisseur;
    @Column(name = "adresse_fournisseur",length = 200)
    private String adresse_fournisseur;

    @Column(name = "email_fournisseur",length = 30,unique = true)
    private String email_fournisseur;
    @Column(name = "tel_fournisseur",length = 8)
    private Integer tel_fournisseur;



    @JsonManagedReference(value ="fournisseur_prd")
    @OneToMany(mappedBy = "fournisseur",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List <Commande_prd> commande_prds1;

    @OneToMany(mappedBy = "fournisseur",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Facture> factures;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_util")
    private Pharmacien pharmaciens;
}
