package com.naya.exams.history.services;

import com.naya.exams.history.dao.ExerciseDao;
import com.naya.exams.history.model.Exercise;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class HistoryExerciseServiceImplTest {
    @Test
    public void shouldHaveAppropriateNumberOfExercises() throws Exception {
        HistoryExerciseServiceImpl service = new HistoryExerciseServiceImpl();
        ExerciseDao dao = Mockito.mock(ExerciseDao.class);
        List<Exercise> exercises = Stream.of(Exercise.builder().question("1").answer("a").build(),
                Exercise.builder().question("2").answer("b").build(),
                Exercise.builder().question("3").answer("c").build(),
                Exercise.builder().question("4").answer("d").build(),
                Exercise.builder().question("5").answer("e").build()).collect(Collectors.toList());
        Mockito.when(dao.findAll()).thenReturn(exercises);
        service.setDao(dao);


        List<Exercise> list = service.getRandom(3);
        Assert.assertNotNull(list);
        Assert.assertEquals(3,list.size());
    }
}