package com.habit.habittrackerv1.model;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.*;

@Entity
public class Activity  {
    @Id
    @GeneratedValue
    private Integer id;

    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "Habit")
    private Habit habit;

    public com.habit.habittrackerv1.model.Habit getHabit() {
        return habit;
    }

    public void setHabit(com.habit.habittrackerv1.model.Habit habit) {
        this.habit = habit;
    }
}
