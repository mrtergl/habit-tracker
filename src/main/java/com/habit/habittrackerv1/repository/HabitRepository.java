package com.habit.habittrackerv1.repository;
import com.habit.habittrackerv1.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit,Integer>{ }