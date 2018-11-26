package com.naya.exams.theology.services;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author Evgeny Borisov
 */
@TestConfiguration
public class NeededServicesForJpaConfig {
    @Bean
    public TheologyExerciseService theologyExerciseService(){
        return new TheologyExerciseServiceImpl();
    }
}
