package com.zane.demo.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach demoCoach;
    private final Coach anotherCoach;

    public DemoController(
            @Qualifier("basketballCoach") Coach demoCoach,
            @Qualifier("basketballCoach") Coach anotherCoach
    ) {
        this.demoCoach = demoCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return demoCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach and demoCoach are " + (demoCoach == anotherCoach);
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
