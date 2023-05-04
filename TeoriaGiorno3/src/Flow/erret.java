package Flow;

import java.util.Scanner;

public class erret {
	
			//es:
				int x =10;
				if(x >0) {
					System.out.println("vero");
				} else {
					System.out.println("falso");
				}
			/////////////////////////	
				if(x >0) {
					System.out.println("x >");
				} else if (x== 10){
					System.out.println("x = ");
				} else if (x== 20){
					System.out.println("x = ");
				}else if (x== 30){
					System.out.println("x = ");
				}else {
					System.out.println("x <");
				}
			//posso mettere n condizioni ma poi l'app diventa pesante e complessa in questo caso poi è meglio usare Switch
			
		//2) SWITCH
				String giornoSett ="lun";
				
				switch(giornoSett) {
				case "lun": 
					System.out.println("giorno1"); 
				break;
				case "mar": 
					System.out.println("giorno2");
					break;
				case mer:
					System.out.println("giorno3");
					break;
				case gio:
					System.out.println("giorno4");
					break;
				case ven:
					System.out.println("giorno5"); 
					break;
				default : 
					System.out.println("hai inserito valore errato");
					break;
			}
			
			//CICLI
			//WHILE
				//esegue istruzioni fin quando la confizione è vera
				//quindi cicla sempre fino a che la condizione è vera e si ferma quando diventa falsa
				//potrei creare loop e cicli infiniti se è sempre vera e blocca pc perchè satura RAM
				// se è falsa non parte proprio
				int i = 0 ;// dichiaro sempre una variabile esterna
				while(i<10) { // fino a quando i è <5 cicla quindi sempre quindi devo far si che a un cetro punto si blocchi
					System.out.println("ciao"); 
				    i ++; // ogni ciclo i incrementa di 1 quindi prima è 0 poi 1,2,3,4,5,
				}
				
				int j =0; 
				while(true) {
					System.out.println(j);
					if(j<5) {
						j++; //così è infito perchè j sempre < 5
					}
				}
				
				 j =0;  //così j è 0 
				while(true) {
					System.out.println(j);
					j++; // incrementa ogni volta di 1
					if(j>=5) {
						break; //si ferma quando è 5
					}
				}
			
			//DO WHILE
				//cicla almeno una volta. se è vero continua e se è flaso si ferma
				// condizione viene messa dopo
				int y = 5; // condizione è falsa quindi non parte proprio
				while(y < 5) {
					System.out.println(y);
					y ++;
				}
				
				int k = 5; // condizione è false quindi fa un solo ciclo e poi si blocca
				do {
					System.out.println(k);
					k++;
				} while (k<5);
				
			//es usi. Login	
				int scelta; 
				do {
					Scanner sc = new Scanner(System.in); //chiedo numeri finchè non metto 0
					System.out.println("inserisci n:");
					scelta = sc.nextInt();
				} while (scelta != 0); // finchè scelta è diverso da 0. quando è 0 si ferma

				
		//FOR LOOP
			for (int g =0; g <5; g++) {
				System.out.println(g);
			}	
			//int g = 0 --> variabile contatore
			// g<5 --> condizione
			// g++ --> incremento 
			for (int gg =0; gg <5; gg +=3) {
				System.out.println(gg);
			}	
			
			for (int m =5; m >0; m--) {
				System.out.println(m);
			}
			//int m = 5 --> variabile contatore
			// m>0 --> condizione
			// m-- --> decremento 
			
			// BREAK FERMA
			for (int p =0; p <10; p++) {
				if(p ==5) // dovrei avere 10 giri ma al 5 si blocca
				break;
			}
			
			//CONTINUA SALTA
			
			for (int q =0; q <10; q++) {
				if(q ==5) 
				continue; // salva e va avanti
			}
			
			//RETURN INTERROMPE E RITORNA VALORE E USABILE ALL'ESTERNO
			
			
}
