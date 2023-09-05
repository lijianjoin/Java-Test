package com.lijianjoin.test.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "additional_costs_price", schema = "test")
@Data
public class AdditionalCostsUnitPriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="price")
    private double price;

    @Column(name="valid_from")
    private LocalDateTime validFrom;

    @Column(name="valid_until")
    private LocalDateTime  validUntil;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="additional_costs_id")
    private AdditionalCostsEntity additionalCosts;
}
