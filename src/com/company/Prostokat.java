package com.company;
class Prostokat extends Figura {
	int wys=0;
	int szer=0;
	
	Prostokat(int wys, int szer, String kolor){
		super();
		this.wys = wys;
		this.szer = szer;
			
	}

    int getPowierzchnia() {
        return (szer * wys);
    }
    
    void przesun(int x, int y){
		this.punkt.x += x;
		this.punkt.y += y;
	};

	public void opis() {
		System.out.println("Kolor prostokatu: " + super.kolor);
		System.out.println("Wysokosc prostokatu: " + this.wys);
		System.out.println("Szerokosc prostokatu: " + this.szer);
	}
}