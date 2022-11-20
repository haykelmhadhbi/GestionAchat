package com.example.projetexamen.services;

import com.example.projetexamen.Repository.ProduitRepository;
import com.example.projetexamen.entities.Produit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements  IProduitService{
    ProduitRepository produitRepository;
    @Override
    public List<Produit> retrieveProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Long id) {
                produitRepository.deleteById(id);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }
}
