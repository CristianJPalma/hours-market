package com.hoursMarket.hoursMarket.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "TimeSlot")
public class TimeSlot extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "start")
    private Timestamp start;

    @Column(name = "end")
    private Timestamp end;
}
