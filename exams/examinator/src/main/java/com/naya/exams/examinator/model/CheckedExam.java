package com.naya.exams.examinator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckedExam {
    private Integer mark;
    @Delegate
    @JsonIgnore
    private Exam exam = new Exam();
}
