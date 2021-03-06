package com.giggs13.springdemo;

import com.giggs13.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = applicationContext.getBean("hockeyCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        applicationContext.close();
    }
}
