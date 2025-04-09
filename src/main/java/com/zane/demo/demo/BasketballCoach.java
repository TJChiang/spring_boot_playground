package com.zane.demo.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your basketball skills for 15 minutes.";
    }
}
