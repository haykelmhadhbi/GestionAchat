package com.example.projetexamen.services;

import com.example.projetexamen.entities.DetailFournisseur;

import java.util.List;

public interface IDetailFournisseur {
    List<DetailFournisseur> retrieveAllDetailFournisseur ();

    DetailFournisseur addDetailFournisseur (DetailFournisseur d);

    DetailFournisseur updateDetailFournisseur(DetailFournisseur d);

    void deleteDetailFournisseur(Long id);

    DetailFournisseur retrieveDetailFournisseur (Long id);
}
