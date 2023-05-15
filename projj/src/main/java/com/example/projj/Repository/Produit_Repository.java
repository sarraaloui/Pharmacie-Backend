package com.example.projj.Repository;

import com.example.projj.entities.Produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Produit_Repository extends JpaRepository<Produit, Long> {

   /*@Query(value = "SELECT * FROM Produit p , Famille f WHERE p.code_fam=f.id_famille and p.code_fam= :id_famille",nativeQuery = true)
    public List<Produit> findByfam(@Param(value = "id_famille") Long id_famille);*/

    @Query(value ="Select p FROM Produit p where p.lib_prd LIKE %?1%")
     List<Produit> findBymot(String rech);

    @Query("Select p FROM Produit p join Commande_prd c on p.id_prd=c.produit.id_prd join Fournisseur f on f.id_frn=c.fournisseur.id_frn where c.fournisseur.id_frn=?1")
    List<Produit> findByfrn(Long id_frn);

    @Query(value = "Select p FROM Produit p JOIN Laboratoire l on p.laboratoires.id_labo=l.id_labo where l.id_labo = ?1")
    List<Produit> findBylab(Long id_lab);

    @Query(value= "Select p  FROM Produit p Join  Famille f on p.famille.id_famille = f.id_famille and f.id_famille = ?1 ")
    List<Produit> findByfam(Long id_famille);

}
