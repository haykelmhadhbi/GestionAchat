package com.example.projetexamen.services;

import com.example.projetexamen.Repository.StockRepository;
import com.example.projetexamen.entities.Stock;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StockSeviceImpl implements  IStockService {
    StockRepository stockRepository;
    @Override
    public List<Stock> retrieveStock() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock st) {
        return stockRepository.save(st);
    }

    @Override
    public Stock updateStock(Stock st) {
        return stockRepository.save(st);
    }

    @Override
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);

    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }
}
