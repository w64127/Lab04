package com.company;

class Trojkat extends Figura
{
	int wys=0;
	int podst=0;

	public Trojkat(int wys,int podst, String kolor)
	{
		super(kolor);
		this.wys = wys;
		this.podst = podst;
		
	}

	public void opis() {
		System.out.println("Kolor trojkata: " + super.kolor);
		System.out.println("Wysokosc trojkata: " + this.wys);
		System.out.println("Podstawa trojkata: " + this.podst);
	}
}