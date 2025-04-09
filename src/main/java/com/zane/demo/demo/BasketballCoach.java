package com.zane.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your basketball skills for 15 minutes.";
    }
}
