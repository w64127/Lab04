package com.company;

import java.util.Random;

public class Taxi extends Auto{
    float[] zarobki = new float[12];

    public Taxi(float[] przebieg){
        super(przebieg);
        Random rand = new Random();

        for(int i=0;i<12;i++){
            int randNo = rand.nextInt(12-0+1);
            this.zarobki[i] = randNo;
        }
    }

    float srZarobki(){
        float value = 0;
        for(int i=0;i<12;i++){
            value = value + this.zarobki[i];
        }
        System.out.println("PRzebieg średni: " + value/12);
        return value /12;
    }
}
