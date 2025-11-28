package com.hoursMarket.hoursMarket.model;

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
@Entity(name = "UserSkill")
public class UserSkill extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "id_skill")
    private Skill skill;

    @Column(name = "level", nullable = false)
    private byte level;

    @Column(name = "priority", nullable = false)
    private byte priority;
}
