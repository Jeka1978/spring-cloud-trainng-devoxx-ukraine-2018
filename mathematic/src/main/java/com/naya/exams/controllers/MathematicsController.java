package com.naya.exams.controllers;

import com.naya.exams.model.Exercise;
import com.naya.exams.services.MathService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exercise")
@RequiredArgsConstructor
public class MathematicsController {
    private final MathService mathService;

    @GetMapping("/random")
    public List<Exercise> getExercises(@RequestParam(value = "amount",defaultValue = "1") Integer amount) {
        return Stream.generate(mathService::getRandomExercise).limit(amount).collect(toList());
    }
}






