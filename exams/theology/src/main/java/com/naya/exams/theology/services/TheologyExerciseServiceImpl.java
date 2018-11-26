package com.naya.exams.theology.services;

import com.naya.exams.theology.dao.ExerciseDao;
import com.naya.exams.theology.model.Exercise;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class TheologyExerciseServiceImpl implements TheologyExerciseService {
    @Autowired
    @Setter
    private ExerciseDao dao;

    @Setter
    @Getter
    private int version;


    @Override
    public List<Exercise> getRandom(int amount) {
        List<Exercise> all = dao.findAll();
        Collections.shuffle(all);
        return all.subList(0,amount);
    }

    @Override
    @EventListener(ContextRefreshedEvent.class)
    public void fillDB() {
        System.out.println("filling db with some data");
        List<Exercise> exercises = Arrays.asList(Exercise.builder().question("How old is God?").answer("100500").build(),
                Exercise.builder().question("How old is Java?").answer("22").build(),
                Exercise.builder().question("How old is Groovy?").answer("16").build()
        );
        dao.saveAll(exercises);
    }
}












