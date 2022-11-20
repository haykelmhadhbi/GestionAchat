package com.example.projetexamen.services;

import com.example.projetexamen.Repository.OperateurRepository;
import com.example.projetexamen.entities.Operateur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OperateurServiceImpl implements IOperateurService{
    OperateurRepository operateurRepository;
    @Override
    public List<Operateur> retrieveOperateur() {
        return operateurRepository.findAll();
    }

    @Override
    public Operateur addOperateur(Operateur o) {
        return operateurRepository.save(o);
    }

    @Override
    public Operateur updateOperateur(Operateur o) {
        return operateurRepository.save(o);
    }

    @Override
    public void deleteOperateur(Long id) {
            operateurRepository.deleteById(id);
    }

    @Override
    public Operateur retrieveOperateur(Long id) {
        return operateurRepository.findById(id).orElse(null);
    }
}
