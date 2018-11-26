package com.naya.exams.theology.controllers;

import com.naya.exams.theology.model.Exercise;
import com.naya.exams.theology.services.TheologyExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exercise")
@RequiredArgsConstructor
public class TheologyController {
    private final TheologyExerciseService service;


    @GetMapping("/random")
    public List<Exercise> getExercises(@RequestParam(value = "amount",defaultValue = "1") Integer amount) {
        return service.getRandom(amount);
    }

}
