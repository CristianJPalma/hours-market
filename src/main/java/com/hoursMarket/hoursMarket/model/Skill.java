package com.hoursMarket.hoursMarket.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Skill")
public class Skill extends BaseModel{

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "category", nullable = false, length = 20)
    private String category;

    @Column(name = "status", nullable = false)
    private int status;

    @OneToMany(mappedBy = "skill")
    private List<UserSkill> userskill;

}
