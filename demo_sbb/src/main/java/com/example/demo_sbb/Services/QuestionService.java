package com.example.demo_sbb.Services;

import com.example.demo_sbb.DataNotFoundException;
import com.example.demo_sbb.entity.QuestionEntity;
import com.example.demo_sbb.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<QuestionEntity> getList() {
        return this.questionRepository.findAll();
    }

    public QuestionEntity getQuestion(Integer id) throws DataNotFoundException {
        Optional <QuestionEntity> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("qustion not found");
        }
    }
}
