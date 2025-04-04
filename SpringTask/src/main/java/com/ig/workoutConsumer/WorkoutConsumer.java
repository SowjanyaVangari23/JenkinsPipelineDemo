package com.ig.workoutConsumer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WorkoutConsumer {

    private static final String BASE_URL = "http://localhost:8080/api/workouts";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        // Fetch all workouts
        ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL + "/all", String.class);
        System.out.println("Workouts: " + response.getBody());
    }
}