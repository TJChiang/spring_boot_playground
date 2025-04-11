package com.zane.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach inside default constructor: abc" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your cricket skills for 15 minutes.";
    }
}
