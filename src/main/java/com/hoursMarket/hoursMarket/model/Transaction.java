package com.hoursMarket.hoursMarket.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Transaction")
public class Transaction extends BaseModel{

    @OneToOne
    @JoinColumn(name = "id_match")
    private Matchs matchs;

    @Column(name = "id_from_user")
    private int id_from_user;

    @Column(name = "id_to_user")
    private int id_to_user;

    @Column(name = "hours")
    private int hours;

    @Column(name = "date")
    private LocalDate date;
}
