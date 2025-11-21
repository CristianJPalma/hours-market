package com.hoursMarket.hoursMarket.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Location")
public class Location extends BaseModel{

    
    @Column(name = "type")
    private String type;

    @Column(name = "neighborhood_name")
    private String neighborhood_name;
    
    @OneToMany(mappedBy = "location")
    private List<Offer> offers;
    
    @OneToMany(mappedBy = "location")
    private List<Request> requests;
}
