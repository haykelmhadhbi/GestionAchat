package com.example.projetexamen.controller;


import com.example.projetexamen.entities.Produit;
import com.example.projetexamen.entities.Reglement;
import com.example.projetexamen.services.IReglementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Reglement")
public class ReglementController {
    IReglementService iReglementService;

    @GetMapping("/getReglement")
    List<Reglement> getAllReglement() {
        return iReglementService.retrieveAllReglement();
    }
    @PostMapping("/ajoutReglement")
    public Reglement addReglement(@RequestBody Reglement r) {
        return iReglementService.addReglement(r);

    }
    @PutMapping("/modifierReglement")
    Reglement updateReglement(@RequestBody Reglement r) {
        return  iReglementService.updateReglement(r);
    }
    @DeleteMapping("/suppReglement/{id}")
    void removeReglement (@PathVariable Long id) {
        iReglementService.deleteReglement(id);
    }
}
