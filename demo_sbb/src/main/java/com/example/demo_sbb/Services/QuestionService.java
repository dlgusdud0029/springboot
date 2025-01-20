package com.example.demo_sbb.Services;

import com.example.demo_sbb.entity.QuestionEntity;
import com.example.demo_sbb.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<QuestionEntity> getList() {
        return this.questionRepository.findAll();
    }
}
