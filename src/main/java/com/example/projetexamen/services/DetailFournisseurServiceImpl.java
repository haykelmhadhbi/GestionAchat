package com.example.projetexamen.services;

import com.example.projetexamen.Repository.DetailFactureRepository;
import com.example.projetexamen.Repository.DetailFournisseurREPOSITORY;
import com.example.projetexamen.entities.DetailFournisseur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class DetailFournisseurServiceImpl implements  IDetailFournisseur {
    DetailFournisseurREPOSITORY detailFournisseurREPOSITORY;
    @Override
    public List<DetailFournisseur> retrieveAllDetailFournisseur() {
        return detailFournisseurREPOSITORY.findAll();

    }

    @Override
    public DetailFournisseur addDetailFournisseur(DetailFournisseur Df) {
        return detailFournisseurREPOSITORY.save(Df);
    }

    @Override
    public DetailFournisseur updateDetailFournisseur(DetailFournisseur Df) {
        return detailFournisseurREPOSITORY.save(Df);
    }

    @Override
    public void deleteDetailFournisseur(Long id) {
        detailFournisseurREPOSITORY.deleteById(id);
    }

    @Override
    public DetailFournisseur retrieveDetailFournisseur(Long id) {
        return detailFournisseurREPOSITORY.findById(id).orElse(null);
    }
}
