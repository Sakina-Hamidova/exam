package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "exam_result")
public class ExamResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="student_point")
    private Double student_point;
    @OneToOne
    @JoinColumn(name="student_id")
    private Student student;
    @OneToOne
    @JoinColumn(name="exam_id")
    private Exam exam;



}
