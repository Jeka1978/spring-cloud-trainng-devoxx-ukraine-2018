package com.naya.exams.examinator.controllers;

import com.naya.exams.examinator.model.Exercise;
import com.naya.exams.frontendstarter.aop.FrontendRestController;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Evgeny Borisov
 */
@FrontendRestController
@RequestMapping("/api")
public class StamController {
    @EventListener(ContextRefreshedEvent.class)
    public void a(){
        System.out.println();
    }

    @GetMapping("/stam")
    public Exercise stam(){
        return Exercise.builder().question("what is the age").answer("100500").build();
    }
}
