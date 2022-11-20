package com.example.projetexamen.controller;


import com.example.projetexamen.entities.DetailFournisseur;
import com.example.projetexamen.entities.Facture;
import com.example.projetexamen.services.IFactureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Facture")
public class FactureController {
    IFactureService iFactureService;
    @GetMapping("/getFacture")
    List<Facture> getAllFacture() {
        return iFactureService.retrieveFacture();
    }
    @PostMapping("/ajoutFacture")
    public Facture addFacture(@RequestBody Facture f) {
        return iFactureService.addFacture(f);

    }
    @PutMapping("/modifierDetailFacture")
    Facture updateFacture (@RequestBody Facture f) {
        return  iFactureService.updateFacture(f);
    }
    @DeleteMapping("/suppFacture/{id}")
    void removeFacture (@PathVariable Long id) {
        iFactureService.deleteFacture(id);
    }
}
