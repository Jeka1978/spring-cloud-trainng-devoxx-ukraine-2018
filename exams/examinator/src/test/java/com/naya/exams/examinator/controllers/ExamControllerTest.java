package com.naya.exams.examinator.controllers;

import com.naya.exams.examinator.dao.ExerciseDao;
import com.naya.exams.examinator.services.SectionDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@WebMvcTest
@ContextConfiguration(classes = NeededServicesForControllersConf.class)
public class ExamControllerTest {
    @MockBean
    ExerciseDao exerciseDao;

    @MockBean
    SectionDao sectionDao;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ApplicationContext context;

    @Test
    public void checkExamContract() throws Exception {

        mockMvc.perform(
                post("/exams/check")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"title\":\"java exam\", \"student\": \"Evgeny Borisov\" }")
        )
                .andExpect(jsonPath("$.mark", allOf(greaterThan(0), lessThan(101))))
                .andExpect(jsonPath("$.title", equalTo("java exam")))
                .andExpect(jsonPath("$.student").doesNotExist())
                .andExpect(status().isOk());

    }

}