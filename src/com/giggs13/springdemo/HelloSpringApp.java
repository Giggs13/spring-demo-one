package com.giggs13.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = applicationContext.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        applicationContext.close();
    }
}
