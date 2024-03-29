package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="parent")
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="surname")
    private String surname;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="phone_number")
    private String phone_number;
    @Column(name="last_login_date")
    private LocalDateTime last_login_date;
    @Column(name="last_login_api")
    private String last_login_api;
    @Column(name="status")
    private int status;


}
