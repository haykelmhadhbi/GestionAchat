package com.example.projetexamen.services;

import com.example.projetexamen.Repository.ReglementRepository;
import com.example.projetexamen.entities.Reglement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReglementServiceImpl implements  IReglementService {
    ReglementRepository reglementRepository;
    @Override
    public List<Reglement> retrieveAllReglement() {
        return reglementRepository.findAll();
    }

    @Override
    public Reglement addReglement(Reglement d) {
        return reglementRepository.save(d);
    }

    @Override
    public Reglement updateReglement(Reglement d) {
        return reglementRepository.save(d);
    }

    @Override
    public void deleteReglement(Long id) {
            reglementRepository.deleteById(id);
    }

    @Override
    public Reglement retrieveReglement(Long id) {
        return reglementRepository.findById(id).orElse(null);
    }
}
