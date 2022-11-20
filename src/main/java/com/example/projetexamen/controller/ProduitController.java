package com.example.projetexamen.controller;


import com.example.projetexamen.entities.Operateur;
import com.example.projetexamen.entities.Produit;
import com.example.projetexamen.services.IProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Produit")
public class ProduitController {
    IProduitService iProduitService;
    @GetMapping("/getProduit")
    List<Produit> getAllOperateur() {
        return iProduitService.retrieveProduit();
    }
    @PostMapping("/ajoutProduitr")
    public Produit addOperateur(@RequestBody Produit p) {
        return iProduitService.addProduit(p);

    }
    @PutMapping("/modifierProduit")
    Produit updateFournisseur(@RequestBody Produit p) {
        return  iProduitService.addProduit(p);
    }
    @DeleteMapping("/suppProduitr/{id}")
    void removeOperateur (@PathVariable Long id) {
        iProduitService.deleteProduit(id);
    }

}
