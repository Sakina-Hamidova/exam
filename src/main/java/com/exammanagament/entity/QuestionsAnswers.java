package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.patterns.TypePatternQuestions;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="questions_answers")
public class QuestionsAnswers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="questions_answers")
    private String questions_answers;
    @Column(name="is_true")
    private int is_true;
    @OneToOne
    @JoinColumn(name="question_id")
    private Questions questions;


}
