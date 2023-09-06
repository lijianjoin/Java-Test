package com.lijianjoin.test.junit4.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="meter_reading", schema = "test")
@Data
public class MeterReadingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addtional_costs_id")
    private AdditionalCostsEntity additionalCost;

    @Column(name = "reading")
    private double reading;

    @Column(name = "reading_date")
    private LocalDateTime readDate;

}
