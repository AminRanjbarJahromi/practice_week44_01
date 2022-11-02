package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Static_or_instance {

    public static int randomNumber(){
        return ThreadLocalRandom.current().nextInt();
    }

    public static int randomNumberBetween(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min)+1)+min;
    }

}
