package com.example.ead.service;

import com.example.ead.entity.Sale;
import com.example.ead.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleService {
    final SaleRepository saleRepository;

    public void save(Sale sale) {
        saleRepository.save(sale);
    }

    public Sale findById(Long SlNo) {
        return saleRepository.findBySlNo(SlNo).orElse(null);
    }

    public void delete(Long SlNo) {
        saleRepository.deleteBySlNo(SlNo);
    }
}
