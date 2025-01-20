package com.example.demo_sbb.repository;

import com.example.demo_sbb.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
    // 단위테스트에서 findBySubject()함수를 사용하기 위해 추가한 코드
    QuestionEntity findBySubject(String subject);
}
