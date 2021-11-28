package com.naya.exams.history.controllers;

import com.naya.exams.history.model.Exercise;
import com.naya.exams.history.services.HistoryExerciseService;
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
public class HistoryController {
    private final HistoryExerciseService service;


    @GetMapping("/random")
    public List<Exercise> getExercises(@RequestParam(value = "amount",defaultValue = "1") Integer amount) {
        return service.getRandom(amount);
    }

}
