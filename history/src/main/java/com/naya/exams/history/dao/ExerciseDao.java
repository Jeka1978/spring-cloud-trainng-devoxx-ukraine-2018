package com.naya.exams.history.dao;

import com.naya.exams.history.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evgeny Borisov
 */

public interface ExerciseDao extends JpaRepository<Exercise,Integer> {

}
