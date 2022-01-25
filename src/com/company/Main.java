package com.company;

public class Main {

    public static void main(String[] args) {
	Figura figura = new Figura();
    Prostokat prostokat = new Prostokat(7,8, "green");
    Punkt punkt = new Punkt();
    Trojkat trojkat = new Trojkat(7,8, "red");

    prostokat.przesun(3,5);

    }
}
