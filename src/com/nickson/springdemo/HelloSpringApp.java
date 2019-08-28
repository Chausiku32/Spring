package com.nickson.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //load spring config class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring
        Coach tCoach = context.getBean("tCoach", Coach.class);

        Coach bCoach = context.getBean("bCoach", Coach.class);

        Coach rCoach = context.getBean("rCoach", Coach.class);

        //call methods on bean
        System.out.println(tCoach.getDailyWorkout());

        System.out.println(bCoach.getDailyWorkout());

        System.out.println(rCoach.getDailyWorkout());

        //call methods added;
        System.out.println(rCoach.getDailyFortune());

        //close context
        context.close();

    }
}
