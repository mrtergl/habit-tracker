package com.habit.habittrackerv1.controller;

import com.habit.habittrackerv1.model.Habit;
import com.habit.habittrackerv1.repository.HabitRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habits")
public class HabitController {

    private final HabitRepository habitRepository;

    public HabitController(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    @PostMapping
     void create(CreateHabitRequest request){
        Habit h = new Habit();
        h.setName(request.name());
        this.habitRepository.save(h);

    }
}
