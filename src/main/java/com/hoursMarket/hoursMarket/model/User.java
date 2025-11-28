package com.hoursMarket.hoursMarket.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity(name = "User")
public class User extends BaseModel{


    // public User(String email, String password, byte status){
    //     this.email = email;
    //     this.password = password;
    //     this.status = status;
    // }
    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(name = "password", nullable = false, length = 150)
    private String password;

    @Column(name = "status", nullable = false)
    private byte status;




    @OneToOne(mappedBy = "user")
    private Profile profile;

    @OneToMany(mappedBy = "user")
    private List<UserSkill> userskills;

    @OneToMany(mappedBy = "user")
    private List<TimeSlot> timeSlots;

    @OneToMany(mappedBy = "user")
    private List<Offer> offers;

    @OneToMany(mappedBy = "user")
    private List<Request> requests;

    
}
