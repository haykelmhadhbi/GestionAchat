package com.example.projetexamen.services;

import com.example.projetexamen.entities.DetailFacture;

import java.util.List;

public interface IDetailFactureService {
    List<DetailFacture> retrieveAllDetailFournisseur ();

    DetailFacture addDetailFacture (DetailFacture d);

    DetailFacture updateDetailFacture(DetailFacture d);

    void deleteDetailFacture(Long id);

    DetailFacture retrieveDetailFacture (Long id);
}
