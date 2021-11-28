package com.naya.exams.examinator.services;

import com.naya.exams.examinator.dao.ExerciseDao;
import com.naya.exams.examinator.model.CheckedExam;
import com.naya.exams.examinator.model.Exercise;
import com.naya.exams.examinator.model.SolvedExam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExerciseDao dao;

    @Autowired
    private SectionDao dao2;
    @Override
    public CheckedExam convert(SolvedExam solvedExam) {
        return CheckedExam.builder().exam(solvedExam.getExam()).mark(80).build();
    }

    @Override
    public List<Exercise> getExercises() {
        return dao.getDefault();
    }
}
