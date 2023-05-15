package com.example.projj.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Data //getter w setters
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor // constructeur avec tous les attributs
@Entity
@Table(name = "Commande_prd")
public class Commande_prd {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id_cmd;

 @JsonBackReference(value="commande_prd")
 @ManyToOne
 @JoinColumn(name = "id_prd")
 private Produit produit;

 @JsonBackReference(value="fournisseur_prd")
 @ManyToOne(fetch = FetchType.EAGER)
 @JoinColumn(name = "id_frn")
 private Fournisseur fournisseur;


 @Column(name = "quantitefourni")
 private Integer quantite_fourni;
 @Column(name = "datefourni")
 private Date datefourni;




}