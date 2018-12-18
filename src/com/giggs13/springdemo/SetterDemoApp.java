package com.giggs13.springdemo;

import com.giggs13.springdemo.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach coach = applicationContext.getBean("cricketCoach", CricketCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());
        applicationContext.close();
    }
}
