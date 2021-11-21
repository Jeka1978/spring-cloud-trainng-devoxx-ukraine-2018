package com.naya.exams.examinator.controllers;

import com.naya.exams.examinator.services.ExamServiceImpl;
import com.naya.exams.examinator.services.ExamService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author Evgeny Borisov
 */
@TestConfiguration
public class NeededServicesForControllersConf {
    @Bean
    public ExamService examService(){
        return new ExamServiceImpl();
    }

    @Bean
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder();
    }
}
