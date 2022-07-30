package com.example.ead.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    private Long SlNo;
    private Long SalesmanID;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "ProdID", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private Set<Product> product;
    private String SalesmanName;
    private String DOS;
}
