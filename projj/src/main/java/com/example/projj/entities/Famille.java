package com.example.projj.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Famille")
public class Famille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_famille;
    @Column(name = "lib_famille",length = 30)
    private String lib_famille;

    @JsonManagedReference(value ="famille_prd")
    @OneToMany(mappedBy = "famille",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Produit> produits;

}
