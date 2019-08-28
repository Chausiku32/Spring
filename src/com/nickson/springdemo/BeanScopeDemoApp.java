package com.nickson.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        //load spring config files
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("tCoach", Coach.class);

        Coach alphaCoach = context.getBean("tCoach", Coach.class);

        //check to see if they are the same
        boolean result = (theCoach == alphaCoach);

        //print out the results
        System.out.println("\n Pointing to the same object:" + result);

        System.out.println("Memory location of theCoach: " + theCoach);

        System.out.println("Memory location of alphaCoach: " + alphaCoach);

    }
}
