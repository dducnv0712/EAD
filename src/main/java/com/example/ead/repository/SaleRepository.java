package com.example.ead.repository;

import com.example.ead.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SaleRepository extends JpaRepository<Sale, String> {

    Optional<Sale> findBySlNo(Long SlNo);

    void deleteBySlNo(Long slNo);
}
