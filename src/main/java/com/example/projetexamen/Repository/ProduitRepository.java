package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
