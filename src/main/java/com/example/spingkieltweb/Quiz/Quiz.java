package com.example.spingkieltweb.Quiz;


import com.example.spingkieltweb.Question.Question;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Quiz {
    @Id
    @SequenceGenerator(
    name = "quiz_sequence",
            sequenceName = "quiz_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quiz_sequence"
    )

    private Long id;
    private Double score;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Question> questions;

    public Quiz(Double score, List<Question> questions) {
        this.score = score;
        this.questions = questions;
    }

    public Quiz(Long id, Double score, List<Question> questions) {
        this.id = id;
        this.score = score;
        this.questions = questions;
    }

    public Quiz() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", score=" + score +
                ", questions=" + questions +
                '}';
    }
}
