package com.example.athletes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="athlete")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50, nullable = false)
    private String name;
    @OneToOne(mappedBy = "athlete")
    private Event event;
    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;
    @ManyToMany
    @JoinTable(
            name = "athlete_certificate",
            joinColumns = {@JoinColumn(name = "athlete_id")},
            inverseJoinColumns = {@JoinColumn(name = "event_id")}
    )
    private Set<Certificate> certificates;
}
