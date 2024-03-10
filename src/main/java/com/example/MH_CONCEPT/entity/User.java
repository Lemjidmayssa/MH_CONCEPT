package com.example.MH_CONCEPT.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {
    @Id
    private String id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "mail")
    private String mail;

    @Column(name = "address")
    private String address;

    @Column(name = "description")
    private String description;

    @Column(name = "landLine")
    private String landLine;

    @Column(name = "mobilePhone")
    private String mobilePhone;

}
