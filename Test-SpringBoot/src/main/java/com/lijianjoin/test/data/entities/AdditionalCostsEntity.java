package com.lijianjoin.test.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "additional_costs", schema = "test")
@Data
public class AdditionalCostsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="price_unit")
    private String priceUnit;

    @Column(name="currency")
    private String currency;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "object_id")
    private ImmobilienObjectEntity immobilienObject;

    @OneToMany(mappedBy = "additionalCosts", fetch = FetchType.EAGER)
    private List<AdditionalCostsUnitPriceEntity> unitPrices;

}
