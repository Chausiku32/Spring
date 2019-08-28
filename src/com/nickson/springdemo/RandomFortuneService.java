package com.nickson.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Duck Duck Goose",
            "Mbogi ni ya kimonyoski",
            "Wanipa hachu fever fever!!!"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;

    }

}
