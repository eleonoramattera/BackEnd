package Esercizio2;



public class Sim {
private int numeroTelefono;
private double credito;
public Chiamata[] listaChiamate;


//COSTRUTTORI
public Sim () {
}

public Sim(int numeroTelefono) {
	this.numeroTelefono = numeroTelefono;
	this.credito= 0;
	this.listaChiamate = new Chiamata[5];
}

public Sim(int numeroTelefono, double credito ) {
	this.numeroTelefono = numeroTelefono;
	this.credito= 0;
	this.listaChiamate = new Chiamata[5];
}

public Sim(int numeroTelefono, double credito, Chiamata [] listaChiamate ) {
	this.numeroTelefono = numeroTelefono;
	this.credito= 0;
	this.listaChiamate = new Chiamata[5];
	
}

public void stampaDati() {
	System.out.println("numero tel: " + this.numeroTelefono + "credito: " + this.credito);
}


public void stampaArray(){
	
	for(int i = 0; i  < listaChiamate.length; i++) {
		System.out.println(listaChiamate[i]);
		
	}
	

}
}
