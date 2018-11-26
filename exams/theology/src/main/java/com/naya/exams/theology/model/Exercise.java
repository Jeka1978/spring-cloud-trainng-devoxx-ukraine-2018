package com.naya.exams.theology.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Evgeny Borisov
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exercise {

    @Id
    @GeneratedValue
    private Integer id;
    private String question;
    private String answer;

















}
