package com.nickson.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from container
        CricketCoach cCoach = context.getBean("cricketCoach", CricketCoach.class);

        GolfCoach gCoach = context.getBean("gCoach", GolfCoach.class);

        //call methods
        System.out.println(gCoach.getDailyFortune());

        System.out.println(gCoach.getDailyWorkout());

        System.out.println(cCoach.getEmailAddress());

        System.out.println(cCoach.getTeam());

        //close context
        context.close();
    }
}
