package com.example.demo_sbb.Services;

import com.example.demo_sbb.entity.AnswerEntity;
import com.example.demo_sbb.entity.QuestionEntity;
import com.example.demo_sbb.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(QuestionEntity question, String content) {
        AnswerEntity answer = new AnswerEntity();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}
