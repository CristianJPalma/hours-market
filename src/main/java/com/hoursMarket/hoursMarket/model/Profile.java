package com.hoursMarket.hoursMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "Profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "bio", nullable = false, length = 50)
    private String bio;

    @Column(name = "photo_url", nullable = true, length = 20)
    private String photo_url;

    @Column(name = "average_rating", nullable = false)
    private double average_rating;

    @Column(name = "balance_hours", nullable = false)
    private double balance_hours;
}
