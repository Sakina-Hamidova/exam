package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="phone_number")
    private String phone_number;
    @Column(name="birth_date")
    private Date birth_date;
    @Column(name="last_login_date")
    private LocalDateTime last_login_date;
    @Column(name="status")
    private int status;
    @Column(name="last_login_ip")
    private String api;
    @Column(name="salary")
    private int salary;


}
