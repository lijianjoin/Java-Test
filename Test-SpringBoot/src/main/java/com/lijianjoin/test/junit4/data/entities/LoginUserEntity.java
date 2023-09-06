package com.lijianjoin.test.junit4.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "user", schema = "test")
@Data
public class LoginUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="type")
    private String userType;

    @Column(name="payment_start")
    private LocalDateTime paymentStart;

    @Column(name="payment_until")
    private LocalDateTime paymentUntil;


}
