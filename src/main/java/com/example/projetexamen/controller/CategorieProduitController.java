package com.example.projetexamen.controller;

import com.example.projetexamen.entities.CategorieProduit;
import com.example.projetexamen.services.CategorieProduitServiceImpl;
import com.example.projetexamen.services.ICategorieProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("categorieProduit")

public class CategorieProduitController {
    ICategorieProduitService iCategorieProduitService;

    @GetMapping("/getvategorieProduit")
    List<CategorieProduit> getAllCategorieProduitt () {
        return  iCategorieProduitService.retrieveAllCategorieProduitt();
    }
    @PostMapping("/ajoutCategorieProduit")
    public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit Cp) {
       return iCategorieProduitService.addCategorieProduit(Cp);

    }
    @PutMapping("/modifierCategorieProduit")
    CategorieProduit updateCategorieProduit (@RequestBody CategorieProduit Cp ) {
            return  iCategorieProduitService.updateCategorieProduit(Cp);
    }
    @DeleteMapping("/suppCategorieProduit/{id}")
    void removeCategorieProduit (@PathVariable Long id) {
            iCategorieProduitService.deleteCategorieProduit(id);
    }






}
