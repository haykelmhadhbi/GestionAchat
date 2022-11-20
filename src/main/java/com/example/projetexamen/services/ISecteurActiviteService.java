package com.example.projetexamen.services;

import com.example.projetexamen.entities.SecteurActivite;

import java.util.List;

public interface ISecteurActiviteService {
    List<SecteurActivite> retrieveSecteurActivite();

    SecteurActivite addSecteurActivite (SecteurActivite d);

    SecteurActivite updateSecteurActivite(SecteurActivite d);

    void deleteSecteurActivite(Long id);

    SecteurActivite retrieveSecteurActivite (Long id);
}
