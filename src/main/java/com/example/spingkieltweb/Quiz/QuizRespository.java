package com.example.spingkieltweb.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRespository extends JpaRepository<Quiz, Long> {

}
