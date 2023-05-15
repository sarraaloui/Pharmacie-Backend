package com.example.projj.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.*;


import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fact;

    @Column(name = "Date_fact")
    private Date Date_fact;

    @Column(name = "total_ht",length = 30)
    private Double total_ht;

    @Column(name = "total_tva",length = 30)
    private Double total_tva;

    @Column(name = "total_ttc",length = 30)
    private Double total_ttc;

    @ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinTable(name="facture_produit_table",
            joinColumns={
    @JoinColumn(name="id_facture",referencedColumnName ="id_fact")}
            , inverseJoinColumns={
    @JoinColumn (name="id_prd",referencedColumnName ="id_prd")})
    private Collection<Produit> produits;


    @ManyToOne
    @JoinColumn(name="id_frn")
    private Fournisseur fournisseur;
}
