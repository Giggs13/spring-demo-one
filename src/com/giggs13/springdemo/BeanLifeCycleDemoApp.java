package com.giggs13.springdemo;

import com.giggs13.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach coach = applicationContext.getBean("trackCoach", Coach.class);

        applicationContext.close();
    }
}
