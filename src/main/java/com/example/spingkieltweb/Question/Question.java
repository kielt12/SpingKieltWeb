package com.example.spingkieltweb.Question;

import javax.persistence.*;

@Entity
@Table
public class Question {

    @Id
    @SequenceGenerator(
            name = "question_sequence",
            sequenceName = "question_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_sequence"
    )

    private Long id;
    private String question;
    private Double answer;
    private Double correct;

    public Question(Long id, String question, Double answer, Double correct) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.correct = correct;
    }

    public Question(String question, Double answer, Double correct) {
        this.question = question;
        this.answer = answer;
        this.correct = correct;
    }

    public Question() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Double getAnswer() {
        return answer;
    }

    public void setAnswer(Double answer) {
        this.answer = answer;
    }

    public Double getCorrect() {
        return correct;
    }

    public void setCorrect(Double correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                ", correct=" + correct +
                '}';
    }
}
