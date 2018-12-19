package com.giggs13.springdemo.coach;

import com.giggs13.springdemo.fortune.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private void postConstruct() {
        System.out.println("Inside a method postConstruct()");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    private void preDestroy() {
        System.out.println("Inside a method onDestroy()");
    }
}
