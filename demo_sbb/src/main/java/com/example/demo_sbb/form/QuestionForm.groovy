package com.example.demo_sbb.form

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size
import lombok.Getter
import lombok.Setter

@Getter
@Setter
class QuestionForm {
    @NotEmpty(message = "제목은 필수항목입니다.")
    @Size(max = 200)
    private String subject;
}
