package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.entities.SecteurActivite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurActiviteReposirory extends JpaRepository<SecteurActivite, Long> {
}
