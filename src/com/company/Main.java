package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        while (true){
            System.out.println(random.nextInt(Integer.MAX_VALUE));
            Thread.sleep(1);
        }
    }
}
