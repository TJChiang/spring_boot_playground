package com.zane.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your track skills for 30 minutes.";
    }
}
