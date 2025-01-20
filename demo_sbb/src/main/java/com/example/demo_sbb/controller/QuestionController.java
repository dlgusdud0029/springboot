package com.example.demo_sbb.controller;

import com.example.demo_sbb.DataNotFoundException;
import com.example.demo_sbb.Services.QuestionService;
import com.example.demo_sbb.entity.QuestionEntity;
import com.example.demo_sbb.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/question/list")
    public String questionList(Model model) {
        List<QuestionEntity> questionList = this.questionService.getList();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }

    @GetMapping(value = "/question/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) throws DataNotFoundException {
        QuestionEntity question = this.questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question_detail";
    }

}
