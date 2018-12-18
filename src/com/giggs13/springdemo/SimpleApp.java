package com.giggs13.springdemo;

import com.giggs13.springdemo.coach.Coach;
import com.giggs13.springdemo.coach.TrackCoach;
import com.giggs13.springdemo.fortune.HappyFortuneService;

public class SimpleApp {

    public static void main(String[] args) {
        Coach coach = new TrackCoach(new HappyFortuneService());
        System.out.println(coach.getDailyWorkout());

        // System.getProperties().forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
