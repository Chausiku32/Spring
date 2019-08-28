package com.nickson.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        //load spring config files
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("tCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());

        Coach vCoach = context.getBean("vCoach", Coach.class);
        System.out.println(vCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
