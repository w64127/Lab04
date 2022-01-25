package com.company;

public class Kwadrat extends Prostokat{

    public Kwadrat(int wys,int szer, String kolor){
        super(wys, szer, kolor);

    }

    public void opis() {
        System.out.println("Kolor kwadratu: " + super.kolor);
        System.out.println("Wysokosc kwadratu: " + super.wys);
        System.out.println("Szerokosc kwadratu: " + super.szer);
    }
}
