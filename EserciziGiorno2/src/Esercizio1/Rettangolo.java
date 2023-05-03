package Esercizio1;

public class Rettangolo {
//attributi di istanza
private double altezza;
private double base;
 
//COSTRUTTORI
public Rettangolo() {
};

public Rettangolo(double altezza, double base) {
	this();
	this.altezza= altezza;
	this.base= base;
	
}

 //metodi
 public  double calcolaPerimetro() {
	 double perimetro= (this.altezza*2) + (this.base*2);
	 return perimetro;
 }
 
 public  double calcolaArea() {
	 double area = this.base *this.altezza;
	 return area;
 }


 
}
