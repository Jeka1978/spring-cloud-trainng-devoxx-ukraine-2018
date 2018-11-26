package com.naya.exams.services;

import com.naya.exams.model.Exercise;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface MathService {
    Exercise getRandomExercise();
}
