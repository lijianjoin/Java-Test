package com.lijianjoin.test.junit4.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "renter", schema = "test")
@Data
public class RenterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="object_id")
    private ImmobilienObjectEntity object;

    @Column(name="title")
    private String title;

    @Column(name="givenname")
    private String givenname;

    @Column(name="surname")
    private String surname;

    @Column(name = "gender")
    private String gender;

    @Column(name="birthdate")
    private Date birthdate;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="email")
    private String email;
}
