package com.example.projetexamen.services;

import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.entities.Operateur;

import java.util.List;

public interface IOperateurService {
    List<Operateur> retrieveOperateur ();

    Operateur addOperateur (Operateur d);

    Operateur updateOperateur(Operateur d);

    void deleteOperateur(Long id);

    Operateur retrieveOperateur(Long id);
}
