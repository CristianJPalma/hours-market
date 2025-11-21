package com.hoursMarket.hoursMarket.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Offer")
public class Offer extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_location")
    private Location location;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "max_hours")
    private byte max_hours;

    @OneToMany(mappedBy = "offer")
    private List<Matchs> matchs;
}
