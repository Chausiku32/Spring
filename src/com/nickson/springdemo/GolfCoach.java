package com.nickson.springdemo;

public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    public GolfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cheza kama wewe";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
