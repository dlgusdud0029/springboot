package com.example.demo_sbb.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.demo_sbb.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
    // 단위테스트에서 findBySubject()함수를 사용하기 위해 추가한 코드
    //QuestionEntity findBySubject(String subject);

    // 페이징을 구현하기 위한 메소드
    QuestionEntity findBySubject(String subject);
    QuestionEntity findBySubjectAndContent(String subject, String content);
    List<QuestionEntity> findAllBySubjectLike(String subject);
    Page<QuestionEntity> findAll(Pageable pageable);
}
