package com.example.projetexamen.services;

import com.example.projetexamen.entities.CategorieProduit;

import java.util.List;

public interface ICategorieProduitService {

    List<CategorieProduit> retrieveAllCategorieProduitt ();

    CategorieProduit addCategorieProduit (CategorieProduit d);

    CategorieProduit updateCategorieProduit(CategorieProduit d);

    void deleteCategorieProduit (Long id);

    CategorieProduit retrieveCategorieProduit (Long id);
}
