package com.naya.exams.history.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Evgeny Borisov
 */
@DataJpaTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = NeededServicesForJpaConfig.class)
public class HistoryExerciseServiceTest {

    @MockBean
    HistoryExerciseService service;

    @Autowired
    ApplicationContext context;

    @Autowired
    private TestEntityManager entityManager;

    @Before
    public void setUpDb(){
//        entityManager.
        System.out.println();
    }

    @Test
    public void getRandom() throws Exception {
        System.out.println();
        Mockito.when(service.getVersion()).thenReturn(1);
    }

    @Test
    public void name() throws Exception {
        Mockito.when(service.getVersion()).thenReturn(5);
        System.out.println();
    }
}