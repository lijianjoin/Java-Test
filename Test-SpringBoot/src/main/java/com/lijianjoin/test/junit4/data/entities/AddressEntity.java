package com.lijianjoin.test.junit4.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="address", schema = "test")
@Data
@AllArgsConstructor
public class AddressEntity {

    public AddressEntity(){
    }

    public AddressEntity(String country,
        String city,
        String zipcode,
        String street,
        String houseNumber,
        String supplement){
        this.country = country;
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.supplement = supplement;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String country;

    @Column
    private String zipcode;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private String houseNumber;

    @Column
    private String supplement;

}
