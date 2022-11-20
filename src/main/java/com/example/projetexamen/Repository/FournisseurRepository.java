package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
