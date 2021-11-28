package com.naya.exams.history.services;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author Evgeny Borisov
 */
@TestConfiguration
public class NeededServicesForJpaConfig {
    @Bean
    public HistoryExerciseService historyExerciseService(){
        return new HistoryExerciseServiceImpl();
    }
}
