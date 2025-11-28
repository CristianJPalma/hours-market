package com.hoursMarket.hoursMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Matchs")
public class Matchs extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "id_offer")
    private Offer offer;

    @ManyToOne
    @JoinColumn(name = "id_request")
    private Request request;

    @Column(name = "id_time_slot", nullable = false)
    private int id_time_slot;

    @Column(name = "reserved_hours", nullable = false)
    private int reserved_hours;

    @OneToOne(mappedBy = "matchs")
    private Transaction transaction;

}
