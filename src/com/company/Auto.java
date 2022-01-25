package com.company;

import java.util.Random;

public class Auto {

    float[] przebieg = new float[12];

    public Auto(float[] przebieg){
        Random rand = new Random();

        for(int i=0; i<12;i++){
            int randNo = rand.nextInt(12-0+1);
            this.przebieg[i] = randNo;
        }
        this.przebieg = przebieg;
    }

    float srPrzebieg(){
        float value = 0;
        for(int i=0;i<12;i++){
            value = value+ this.przebieg[i];
        }
        System.out.println("PRzebieg średni: " + value/12);
        return value /12;
    }
}
