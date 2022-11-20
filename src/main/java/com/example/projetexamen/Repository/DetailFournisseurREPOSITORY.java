package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.DetailFacture;
import com.example.projetexamen.entities.DetailFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFournisseurREPOSITORY extends JpaRepository<DetailFournisseur, Long> {
}
