package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.CategorieProduit;
import com.example.projetexamen.entities.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepository extends JpaRepository<DetailFacture, Long> {
}
