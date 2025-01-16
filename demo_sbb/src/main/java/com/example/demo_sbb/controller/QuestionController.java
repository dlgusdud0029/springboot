package com.example.demo_sbb.controller;

import com.example.demo_sbb.entity.QuestionEntity;
import com.example.demo_sbb.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String questionList(Model model) {
        List<QuestionEntity> questionList = questionRepository.findAll();
        model.addAttribute("questionList", questionList);
        return "questionList";
    }
}
