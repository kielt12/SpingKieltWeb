package com.example.spingkieltweb.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")

public class QuizController {
    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @CrossOrigin
    @GetMapping(path = "get-module")
    public List<Quiz> getCard() {
        return quizService.getCard();
    }

    @CrossOrigin
    @PostMapping(path = "set-module")
    public void addCard(@RequestBody Quiz quiz){
        quizService.addCard(quiz);
    }

}
