package com.example.demo_sbb;

import com.example.demo_sbb.Services.QuestionService;
import com.example.demo_sbb.entity.AnswerEntity;
import com.example.demo_sbb.entity.QuestionEntity;
import com.example.demo_sbb.repository.AnswerRepository;
import com.example.demo_sbb.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoSbbApplicationTests2 {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() {
        // 테스트 더미 데이터 넣기
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content);
        }
        // 1. findAll 메서드
        // 데이터베이스에 저장된 데이터의 사이즈를 조회하여 우리가 넣은 데이터 크기만큼 들어가 있는지 확인하는 테스트
        // findAll() 메소드를 통해 데이터 모두 조회 = SELECT * FROM QUESTION_ENTITY
//        List<QuestionEntity> all = this.questionRepository.findAll();
        // assertEquals 함수는 두개의 값을 비교해주는 함수
//        assertEquals(2, all.size());
//
//        QuestionEntity q = all.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());

        // 2. findById 메소드
        // id가 1인 질문을 조회하여 제대로 조회됬는지 확인하는 테스트 코드
        // findById() : Id값을 통해서 데이터 조회
//        Optional<QuestionEntity> oq = this.questionRepository.findById(1);
//        if (oq.isPresent()) {
//            QuestionEntity q = oq.get();
//            assertEquals("sbb가 무엇인가요?", q.getSubject());
//        }

        // 3. findBySubject() 메소드
        // findBySubject() : 제목을 통해서 데이터 조회 -> 가본으로 제공 X
        //                  -> QuestionRepository에 코드 추가
//        QuestionEntity q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//        assertEquals(1, q.getId());

        // 4. 데이터 수정
        // assertTrue() : 참거짓 판단하는 메소드
//        Optional<QuestionEntity> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        QuestionEntity q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);

        // 5. 데이터 삭제
//        assertEquals(2, questionRepository.count());
//        Optional<QuestionEntity> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        QuestionEntity q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, questionRepository.count());

        // 답변 엔티티 생성
//        Optional<QuestionEntity> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        QuestionEntity q = oq.get();
//
//        AnswerEntity a = new AnswerEntity();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q); // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
    }

}
