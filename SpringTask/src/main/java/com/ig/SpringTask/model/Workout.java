package com.ig.SpringTask.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "workouts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @Min(value = 1, message = "Duration must be at least 1 minute")
    private int duration;

    @Min(value = 1, message = "Calories burnt must be at least 1")
    private int caloriesBurnt;

    @NotBlank(message = "Category is required")
    private String category;
}
