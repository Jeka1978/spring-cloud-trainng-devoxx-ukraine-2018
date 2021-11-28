package com.naya.exams.examinator.services;

import com.naya.exams.examinator.dao.ExerciseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = {
    "exam.title=Text exam"
})
public class ExamServiceImplTest {

    @Autowired
    ExamService examService;

    @MockBean
    ExerciseDao dao;


    @Test
    public void getExercises() throws Exception {
        Mockito.when(dao.getDefault()).thenReturn(Arrays.asList());
    }

}