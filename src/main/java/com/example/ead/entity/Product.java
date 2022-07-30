package com.example.ead.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "products")
public class Product {
    @Id
    private Long ProdID;
    private String ProdName;
    private String Description;
    private LocalDateTime DateOfManf;
    private BigDecimal Price;
}
