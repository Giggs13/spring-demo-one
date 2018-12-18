package com.giggs13.springdemo.coach;

import com.giggs13.springdemo.fortune.FortuneService;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Go ski, damn!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
