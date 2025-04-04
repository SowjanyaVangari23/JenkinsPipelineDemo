package com.ig.SpringTask.service;

import com.ig.SpringTask.model.Workout;
import com.ig.SpringTask.repo.WorkoutRepository;
import com.ig.SpringTask.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public Workout addWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public Workout getWorkoutById(Long id) {
        return workoutRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Workout not found with ID: " + id));
    }
}
