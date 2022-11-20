package com.example.projetexamen.services;

import com.example.projetexamen.entities.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> retrieveProduit ();

    Produit addProduit (Produit d);

    Produit updateProduit(Produit d);

    void deleteProduit(Long id);

    Produit retrieveProduit (Long id);
}
