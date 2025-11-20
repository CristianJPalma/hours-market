package com.hoursMarket.hoursMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Profile")
public class Profile extends BaseModel{

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
