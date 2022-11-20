package com.example.projetexamen.services;

import com.example.projetexamen.Repository.FactureRepository;
import com.example.projetexamen.entities.Facture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FactureServiceImpl implements IFactureService{
    FactureRepository factureRepository;
    @Override
    public List<Facture> retrieveFacture() {
        return factureRepository.findAll();
    }

    @Override
    public Facture addFacture(Facture F) {
        return factureRepository.save(F);
    }

    @Override
    public Facture updateFacture(Facture F) {
        return factureRepository.save(F);
    }

    @Override
    public void deleteFacture(Long id) {
        factureRepository.deleteById(id);

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }
}
