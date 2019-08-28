package com.nickson.springdemo;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;

    public VolleyballCoach() {
    }

    public VolleyballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Chapa tizi";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add init method
    public void doMyStartupStuffV(){
        System.out.println("VolleyballCoach: inside method doMyStartupStuffV");
    }

    //add destroy method
    public void doMyCleanupStuffVoVo(){
        System.out.println("VolleyballCoach: inside method doMyCleanupStuffVovo");
    }

}
