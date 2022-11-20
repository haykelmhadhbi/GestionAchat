package com.example.projetexamen.controller;


import com.example.projetexamen.entities.Produit;
import com.example.projetexamen.entities.Stock;
import com.example.projetexamen.services.IStockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Stock")
public class StockController {
    IStockService iStockService;

    @GetMapping("/getStock")
    List<Stock> getAllOperateur() {
           return  iStockService.retrieveStock();
    }
    @PostMapping("/ajoutStock")
    public Stock addOperateur(@RequestBody Stock s) {
       return iStockService.addStock(s);


    }
    @PutMapping("/modifierStock")
    Stock updateFournisseur(@RequestBody Stock s) {
        return iStockService.updateStock(s);

    }
    @DeleteMapping("/suppStock/{id}")
    void removeOperateur (@PathVariable Long id) {
        iStockService.deleteStock(id);

    }
}
