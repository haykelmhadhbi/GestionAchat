package com.example.projetexamen.services;

import com.example.projetexamen.entities.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> retrieveFacture ();

    Facture addFacture (Facture d);

    Facture updateFacture(Facture d);

    void deleteFacture(Long id);

    Facture retrieveFacture (Long id);
}
