package com.example.projetexamen.services;

import com.example.projetexamen.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    List<Fournisseur> retrieveFournisseur ();

    Fournisseur addFournisseur (Fournisseur d);

    Fournisseur updateFournisseur(Fournisseur d);

    void deleteFournisseur(Long id);

    Fournisseur retrieveFournisseur (Long id);
}
