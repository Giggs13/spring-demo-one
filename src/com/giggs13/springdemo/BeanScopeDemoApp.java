package com.giggs13.springdemo;

import com.giggs13.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach coach1 = applicationContext.getBean("trackCoach", Coach.class);
        Coach coach2 = applicationContext.getBean("trackCoach", Coach.class);

        boolean result = coach1 == coach2;
        System.out.println("Pointing to the same object: " + result);

        applicationContext.close();
    }
}
