package com.example.spingkieltweb.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRespository quizRespository;

    @Autowired
    public QuizService(QuizRespository quizRespository) {
        this.quizRespository = quizRespository;
    }

    public List<Quiz> getCard() {
        return quizRespository.findAll();
    }

    public void addCard(Quiz quiz) {
//        if(quiz.getHeader() == null || quiz.getHeader().isEmpty()){
//           throw new ApiRequestException("header can not be empty");
//        }
//        if(quiz.getIcons() == null || quiz.getIcons().isEmpty()){
//            throw new ApiRequestException("icon can not be empty");
//        }
//        if(quiz.getImage() == null || quiz.getImage().isEmpty()){
//            throw new ApiRequestException("image can not be empty");
//        }
//        if(quiz.getParagraph() == null || quiz.getParagraph().isEmpty()){
//            throw new ApiRequestException("Paragraph can not be empty");
//        }
//        if(quiz.getGithub() == null || quiz.getGithub().isEmpty()){
//            throw new ApiRequestException("github-Url can not be empty");
//        }
        System.out.println(quiz);

            quizRespository.save(quiz);


    }

}
