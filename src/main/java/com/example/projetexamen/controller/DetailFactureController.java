package com.example.projetexamen.controller;

import com.example.projetexamen.entities.CategorieProduit;
import com.example.projetexamen.entities.DetailFacture;
import com.example.projetexamen.services.DetailFactureServiceImpl;
import com.example.projetexamen.services.IDetailFactureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("DetailFacture")

public class DetailFactureController {
     IDetailFactureService iDetailFactureService;
    @GetMapping("/getdetailFactureService")
    List<DetailFacture> getAlldetailFactureService () {
        return iDetailFactureService.retrieveAllDetailFournisseur();
    }
    @PostMapping("/ajoutdetailFactureService")
    public DetailFacture addCategorieProduit(@RequestBody DetailFacture Df) {
        return iDetailFactureService.addDetailFacture(Df);

    }
    @PutMapping("/modifierDetailFacture")
    DetailFacture updateCategorieProduit (@RequestBody DetailFacture Df) {
        return  iDetailFactureService.updateDetailFacture(Df);
    }
    @DeleteMapping("/suppDetailFacture/{id}")
    void removeCategorieProduit (@PathVariable Long id) {
                iDetailFactureService.deleteDetailFacture(id);
        }

}
