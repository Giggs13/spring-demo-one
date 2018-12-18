package com.giggs13.springdemo.fortune;

import java.util.Random;

public class BadFortuneService implements FortuneService {

    private static final String[] badFortunes = {"Bad Day 1", "Bad Day 2", "Bad Day 3"};

    @Override
    public String getFortune() {
        return badFortunes[new Random().nextInt(3)];
    }
}
