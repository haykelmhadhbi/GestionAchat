package com.example.projetexamen.services;

import com.example.projetexamen.entities.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveStock ();

    Stock addStock (Stock d);

    Stock updateStock(Stock d);

    void deleteStock(Long id);

    Stock retrieveStock (Long id);
}
