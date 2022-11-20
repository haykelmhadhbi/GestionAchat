package com.example.projetexamen.controller;


import com.example.projetexamen.entities.Fournisseur;
import com.example.projetexamen.entities.Operateur;
import com.example.projetexamen.services.IOperateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Operateur")
public class OperateurController {
    IOperateurService iOperateurService;
    @GetMapping("/getOperateur")
    List<Operateur> getAllOperateur() {
        return iOperateurService.retrieveOperateur();
    }
    @PostMapping("/ajoutOperateur")
    public Operateur addOperateur(@RequestBody Operateur o) {
        return iOperateurService.addOperateur(o);

    }
    @PutMapping("/modifierOperateur")
    Operateur updateFournisseur(@RequestBody Operateur o) {
        return  iOperateurService.updateOperateur(o);
    }
    @DeleteMapping("/suppOperateur/{id}")
    void removeOperateur (@PathVariable Long id) {
       iOperateurService.deleteOperateur(id);
    }

}
