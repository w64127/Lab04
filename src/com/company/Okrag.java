package com.company;

public class Okrag extends Figura{
    Punkt srodek;
    int promien;

    public Okrag(){
        this.srodek = new Punkt(4,5);
        this.promien = 2;
    }

    double getPowierzchnia(){
        return Math.PI * Math.pow(promien,2);
    }

    float getSrednica(){
        return this.promien *2;
    }

    float getPromien(){
        return this.promien;
    }

    boolean wSrodku(Punkt p){
        return (Math.pow(p.x + p.y,2) + Math.pow(this.srodek.x + this.srodek.y,2)) < Math.pow(this.promien,2);
    }

}
