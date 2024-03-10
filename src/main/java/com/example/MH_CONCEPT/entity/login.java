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
@Table(name = "Login")
public class login {
    @Id
    private String login;

    @Column(name = "password")
    private String password;
}
