package com.lijianjoin.test.junit4.data.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="immobilienobject", schema = "test")
@Data
public class ImmobilienObjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private LoginUserEntity user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="address_id")
    private AddressEntity address;

    @Column(name="object_supplement")
    private String ObjectSupplement;

    @Column(name="net_rent")
    private double netRent;

    @Column(name="additional_costs")
    private double additionalCosts;

    @Column(name="living_area")
    private int livingArea;

    @Column(name="living_people_count")
    private int livingPeopleCount;

    @Column(name="sub_object")
    private boolean isSubObject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="parent_object_id")
    private ImmobilienObjectEntity parentObject;

    @Column(name="object_type")
    private String objectType;

}
