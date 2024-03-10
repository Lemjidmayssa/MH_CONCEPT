package com.example.MH_CONCEPT.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Service")
public class Service {
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;
}
