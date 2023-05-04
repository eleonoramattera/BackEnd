package Esercizio2;



public class Sim {
private int numeroTelefono;
private double credito;
public Chiamata[] listaChiamate;


//COSTRUTTORI
public Sim () {
}

public Sim(int numeroTelefono) {
	this();
	this.numeroTelefono = numeroTelefono;
	this.credito= 0;
	this.listaChiamate = new Chiamata[5];
}

public Sim(int numeroTelefono, double credito ) {
	this();
	this.numeroTelefono = numeroTelefono;
	this.credito= 0;
	this.listaChiamate = new Chiamata[5];
}

public Sim(int numeroTelefono, double credito, Chiamata [] listaChiamate ) {
	this();
	this.numeroTelefono = numeroTelefono;
	this.credito= 0;
	this.listaChiamate = new Chiamata[5];
	
}

public void stampaDati() {
	System.out.println("numero tel: " + this.numeroTelefono + "credito: " + this.credito);
}


public Chiamata stampaArray(){
    Chiamata cc = null;
	for(int i = 0; i  < listaChiamate.length; i++) {
		cc = listaChiamate[i];
		System.out.println(listaChiamate[i]);
		
	}

	return cc;
	

}
}
