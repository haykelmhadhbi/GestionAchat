package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.entities.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperateurRepository extends JpaRepository<Operateur, Long> {
}
