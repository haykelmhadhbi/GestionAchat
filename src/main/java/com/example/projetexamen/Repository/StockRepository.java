package com.example.projetexamen.Repository;

import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
