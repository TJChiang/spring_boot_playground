package com.zane.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zane.util.Coach;

@RestController
public class DemoController {

    @Autowired
    private Coach demoCoach;

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return demoCoach.getDailyWorkout();
    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello, World!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }
}
