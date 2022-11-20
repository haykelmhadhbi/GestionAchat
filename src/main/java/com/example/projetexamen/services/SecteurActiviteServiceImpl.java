package com.example.projetexamen.services;

import com.example.projetexamen.Repository.SecteurActiviteReposirory;
import com.example.projetexamen.entities.SecteurActivite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SecteurActiviteServiceImpl implements  ISecteurActiviteService{
    SecteurActiviteReposirory secteurActiviteReposirory;
    @Override
    public List<SecteurActivite> retrieveSecteurActivite() {
        return secteurActiviteReposirory.findAll();
    }

    @Override
    public SecteurActivite addSecteurActivite(SecteurActivite Sa) {
        return secteurActiviteReposirory.save(Sa);
    }

    @Override
    public SecteurActivite updateSecteurActivite(SecteurActivite Sa) {
        return secteurActiviteReposirory.save(Sa);
    }

    @Override
    public void deleteSecteurActivite(Long id) {
                secteurActiviteReposirory.deleteById(id);
    }

    @Override
    public SecteurActivite retrieveSecteurActivite(Long id) {
        return secteurActiviteReposirory.findById(id).orElse(null);
    }
}
