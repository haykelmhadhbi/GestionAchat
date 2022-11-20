package com.example.projetexamen.services;

import com.example.projetexamen.entities.Reglement;

import java.util.List;

public interface IReglementService {
    List<Reglement> retrieveAllReglement ();

    Reglement addReglement (Reglement d);

    Reglement updateReglement (Reglement d);

    void deleteReglement (Long id);

    Reglement retrieveReglement (Long id);
}
