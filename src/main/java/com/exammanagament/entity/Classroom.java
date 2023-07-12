package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="class_name")
    private String name;
    @Column(name="create_year")
    private Date create_year;
    @Column(name="status")
    private int status;
    @OneToOne
    @JoinColumn(name="teacher_id")
    private Teacher teacher;
    @OneToMany(targetEntity = Student.class)
    @JoinColumn(name="classroom_id")
    private List<Student> students;



}
