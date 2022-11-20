package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.DetailFournisseur;
import com.example.projetexamen.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
