package com.example.projetexamen.controller;


import com.example.projetexamen.entities.SecteurActivite;
import com.example.projetexamen.entities.Stock;
import com.example.projetexamen.services.ISecteurActiviteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("secteurActiviter")
public class SecteurActiviterController {
    ISecteurActiviteService iSecteurActiviteService;

    @GetMapping("/getSecteurActivite")
    List<SecteurActivite> getAllOperateur() {
        return iSecteurActiviteService.retrieveSecteurActivite();
    }
    @PostMapping("/ajoutSecteurActivite")
    public SecteurActivite addOperateur(@RequestBody SecteurActivite s) {
        return iSecteurActiviteService.addSecteurActivite(s);


    }
    @PutMapping("/modifierSecteurActivite")
    SecteurActivite updateFournisseur(@RequestBody SecteurActivite s) {
        return  iSecteurActiviteService.updateSecteurActivite(s);

    }
    @DeleteMapping("/suppSecteurActivite/{id}")
    void removeOperateur (@PathVariable Long id) {
        iSecteurActiviteService.deleteSecteurActivite(id);

    }
}
