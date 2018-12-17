package com.giggs13.springdemo;

public class AppEntry {

    public static void main(String[] args) {
        Coach coach = new TrackCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
