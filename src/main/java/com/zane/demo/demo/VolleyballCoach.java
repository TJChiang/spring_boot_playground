package com.zane.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    public VolleyballCoach() {
        System.out.println("VolleyballCoach inside default constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your volleyball skills for 15 minutes.";
    }
}
