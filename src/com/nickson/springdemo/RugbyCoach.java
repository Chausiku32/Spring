package com.nickson.springdemo;

public class RugbyCoach implements Coach {

    private FortuneService fortuneService;

    public RugbyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Chapa warm up";
    }

    @Override
    public String getDailyFortune() {
        return "JUST DO IT: " + fortuneService.getFortune();
    }
}
