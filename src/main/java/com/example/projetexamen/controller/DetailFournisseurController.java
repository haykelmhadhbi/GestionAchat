package com.example.projetexamen.controller;


import com.example.projetexamen.entities.DetailFacture;
import com.example.projetexamen.entities.DetailFournisseur;
import com.example.projetexamen.services.IDetailFactureService;
import com.example.projetexamen.services.IDetailFournisseur;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("DetailFournisseur")
public class DetailFournisseurController {

    IDetailFournisseur iDetailFournisseur;

    @GetMapping("/getdetailFactureService")
    List<DetailFournisseur> getAllDetailFournisseur() {
        return iDetailFournisseur.retrieveAllDetailFournisseur();
    }
    @PostMapping("/ajoutdetailFactureService")
    public DetailFournisseur addDetailFournisseur(@RequestBody DetailFournisseur Df) {
        return iDetailFournisseur.addDetailFournisseur(Df);

    }
    @PutMapping("/modifierDetailFacture")
    DetailFournisseur updateCategorieProduit (@RequestBody DetailFournisseur Df) {
        return  iDetailFournisseur.updateDetailFournisseur(Df);
    }
    @DeleteMapping("/suppDetailFacture/{id}")
    void removeCategorieProduit (@PathVariable Long id) {
        iDetailFournisseur.deleteDetailFournisseur(id);
    }


}
