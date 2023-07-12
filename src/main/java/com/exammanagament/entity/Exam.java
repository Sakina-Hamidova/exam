package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "exam_name")
    private String exam_name;
    @Column(name = "start_date")
    private LocalDateTime start_date;
    @OneToOne
    @JoinColumn(name="exam_type")
    private ExamType examType;
    @OneToMany
    @JoinColumn(name="question_id")
    private List<Questions> questions;
}
