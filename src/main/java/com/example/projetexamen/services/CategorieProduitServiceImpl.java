package com.example.projetexamen.services;

import com.example.projetexamen.Repository.CategorieProduitRepository;
import com.example.projetexamen.entities.CategorieProduit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategorieProduitServiceImpl implements ICategorieProduitService {
    CategorieProduitRepository categorieProduitRepository;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduitt() {
        return categorieProduitRepository.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit d) {
        return categorieProduitRepository.save(d);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit d) {
        return categorieProduitRepository.save(d);
    }

    @Override
    public void deleteCategorieProduit(Long id) {
        categorieProduitRepository.deleteById(id);

    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieProduitRepository.findById(id).orElse(null);
    }
}
