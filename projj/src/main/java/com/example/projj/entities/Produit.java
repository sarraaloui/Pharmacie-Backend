package com.example.projj.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Data //getter w setters
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor // constructeur avec tous les attributs
@Entity
@Table(name = "Produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prd;


    @Column(name = "lib_prd",length = 30)
    private String lib_prd;
    @Column(name = "description_prd",length = 200)
    private String description_prd;
    @Column(name = "prix_prd",length = 30)
    private Double prix_prd;
    @Column(name = "DateAjout_prd")
    private Date dateAjout_prd;
    @Column(name = "prix_liv",length = 4)
    private Float prix_liv;
/*
  @ManyToMany(mappedBy = "prod")
    Set<Fournisseur> fournisseurSet=new HashSet<>();
*/
     @JsonManagedReference(value="commande_prd")
     @OneToMany(mappedBy = "produit" ,cascade = CascadeType.REMOVE, orphanRemoval = true)
     private List<Commande_prd> commande_prds;

    @JsonBackReference(value = "famille_prd")
    @ManyToOne
    @JoinColumn(name="code_fam")
    private Famille famille;
    @JsonBackReference(value="laboratoires_prd")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_labo")
    private Laboratoire laboratoires;

    @ManyToMany(mappedBy="produits",fetch=FetchType.LAZY)
    private Collection <Facture> factures;
}
