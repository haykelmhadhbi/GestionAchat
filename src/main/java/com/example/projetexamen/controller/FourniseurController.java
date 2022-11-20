package com.example.projetexamen.controller;


import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.entities.Fournisseur;
import com.example.projetexamen.services.IFournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Fournisseur")

public class FourniseurController {
    IFournisseurService iFournisseurService;

    @GetMapping("/getFournisseur")
    List<Fournisseur> getAllFournisseur() {
        return iFournisseurService.retrieveFournisseur();
    }
    @PostMapping("/ajoutFacture")
    public Fournisseur addFournisseur(@RequestBody Fournisseur f) {
        return iFournisseurService.addFournisseur(f);

    }
    @PutMapping("/modifierFournisseur")
    Fournisseur updateFournisseur(@RequestBody Fournisseur f) {
        return  iFournisseurService.updateFournisseur(f);
    }
    @DeleteMapping("/suppFacture/{id}")
    void removeFournisseure (@PathVariable Long id) {
       iFournisseurService.deleteFournisseur(id);
    }
}
