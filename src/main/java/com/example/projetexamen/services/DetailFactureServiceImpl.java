package com.example.projetexamen.services;

import com.example.projetexamen.Repository.DetailFactureRepository;
import com.example.projetexamen.entities.DetailFacture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailFactureServiceImpl implements  IDetailFactureService {
    DetailFactureRepository detailFactureRepository;
    @Override
    public List<DetailFacture> retrieveAllDetailFournisseur() {
        return detailFactureRepository.findAll();
    }

    @Override
    public DetailFacture addDetailFacture(DetailFacture Df) {
        return detailFactureRepository.save(Df);
    }

    @Override
    public DetailFacture updateDetailFacture(DetailFacture Df) {
        return detailFactureRepository.save(Df);
    }

    @Override
    public void deleteDetailFacture(Long id) {
        detailFactureRepository.deleteById(id);
    }

    @Override
    public DetailFacture retrieveDetailFacture(Long id) {
        return detailFactureRepository.findById(id).orElse(null);

    }
}
