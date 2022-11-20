package com.example.projetexamen.services;

import com.example.projetexamen.Repository.FournisseurRepository;
import com.example.projetexamen.entities.Fournisseur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class FournisseurServiceImpl implements  IFournisseurService{
    FournisseurRepository fournisseurRepository;
    @Override
    public List<Fournisseur> retrieveFournisseur() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur F) {
        return fournisseurRepository.save(F);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur F) {
        return fournisseurRepository.save(F);
    }

    @Override
    public void deleteFournisseur(Long id) {
         fournisseurRepository.deleteById(id);

    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }
}
