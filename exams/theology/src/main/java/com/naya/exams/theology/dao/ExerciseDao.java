package com.naya.exams.theology.dao;

import com.naya.exams.theology.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evgeny Borisov
 */

public interface ExerciseDao extends JpaRepository<Exercise,Integer> {

}
