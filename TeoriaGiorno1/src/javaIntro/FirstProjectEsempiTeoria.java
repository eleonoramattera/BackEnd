package javaIntro;



import java.util.Scanner;//è una delle classi nelle librerie JRE

public class FirstProjectEsempiTeoria {

	public static void main(String[] args) {
	System.out.println("ciao"); //console.log
  
//PRIMITIVE
	//variabili
	
	boolean t = true;
	boolean f = false;
	
	short s = 2;
	int in = 250; //default
	long l = 24_230;
	
	double d = 25.46; //default
	float fl = 23.2f; // devo mettere f alla fine o lo considera double e quindi 
	                  // come se stessi mettendo un double dentro float. Errore 
	                  //perchè double 65 bit e float 32bit
	
	char a = 25; // Non da errore ma in console lo converte in codice ashii
	char c = 'c';
	String str ="ciao"; // è equiparato a un dato primitivo primitivo ma avrei dovuto fare
	                    //String srt = new String(); perchè è un oggetto, classe

	//costanti (MAIUSCOLO)
	final int NUM = 40;
	final String ST = "costante";
	
//REFERENCE (per vedere contenuto: array devo ciclare, istanza devo mettere il toString() )
	//Array
	
	//1) vuoto
	int arrInteri [] = new int[5];// quando è vuoto devo mettere la lunghezza perchè java deve creare uno spazio di memoria per l'array. Devo sapere necessaiamente lenght
//  tipo   nome   []  new perchè non è primitivo
	
    //per rimpirlo
	arrInteri[0] =23;
	arrInteri[1] =30;
	arrInteri[2] =98;
	arrInteri[3] =11;
	arrInteri[4] = 45;
	//arrInteri[5]= 2; ERRORE perchè l'array ha solo 5 posti
	
	//stampare length
	System.out.println(arrInteri.length); //esce 5
	//stamapare array
	System.out.println(arrInteri);//NO.così stampa indirizzo ad area di memoria
	//stamapare ogni singolo elemento 
	for(int i =0; i<arrInteri.length; i++) {
		System.out.println(arrInteri[i]);
	}
	
	//2) pieno
	String sett[] = {"lun", "mar", "merc"}; //se già conosco elemtenti interni arr
	System.out.println(sett.length);
	//modificare elem
	sett[2] ="gio";
	
	//MATRICI
	//array bidimensionali, array di array --> in JS: Let arr:[[html, css], [js, typescrit], [node, bootstrp]];
	
	//1)
	int [][] doppioArr = new int[2][4]; //2 e 4 n°posizioni, indici (2aaray di 4 elem)
    doppioArr[0][0]=11;  //-->array0 alla posizione 0 ha 11;
    doppioArr[0][1]=21;  //-->array0 alla posizione 1 ha 21;
    doppioArr[0][2]=31;  //-->array0 alla posizione 2 ha 31;
    doppioArr[0][3]=41;  //-->array0 alla posizione 3 ha 41;
    
    doppioArr[1][0]=91;  //-->array1 alla posizione 0 ha 91;
    doppioArr[1][1]=81;  //-->array1 alla posizione 1 ha 81;
    doppioArr[1][2]=71;  //-->array1 alla posizione 2 ha 71;
    doppioArr[1][3]=61;  //-->array1 alla posizione 3 ha 61;
    
    System.out.println(doppioArr[0][2]);
    
    for(int i=0; i<doppioArr.length; i++) {
    	for (int x=0; x< doppioArr[i].length; x++) {
    		System.out.println(doppioArr[i][x]+ "__");
    	}
	}
 
    //2)
    int [][] arrDoppio = {
    	                 	{1,2,3,4}, 
    	                 	{5,6,7,8}, 
    	                 	{9,10,11,12}
                         }; //3 array di 4 elem.(posso avere anche lunghezza diversa)
	System.out.println(arrDoppio[1][2]); //array1 all'indice 2
    
	//modificare
	//arrDoppio[2][2]=20; //array2 all'indice 2 (era 11 prima)
	System.out.println(arrDoppio[2][2]);
	System.out.println(arrDoppio);//indirizzo memoria
	
	for(int i=0; i<arrDoppio.length; i++) {
    	for (int x=0; x< arrDoppio[i].length; x++) {
    		System.out.print(arrDoppio[i][x]+ "/");
    	}
	}
	//per stampare un array sotto l'altro
	for(int i=0; i<arrDoppio.length; i++) {
    	for (int x=0; x< arrDoppio[i].length; x++) {
    		System.out.print(arrDoppio[i][x]+ "/");
    	}
    	System.out.println();
	}
   
/*
	-array misto di stringhe e numeri non lo posso fare NO
	-Potrei dare array di object.SI Es.Auto e Moto che estendono Veicolo
	In java tutto è un object quindi tratto Stringhe e numeri come se fossero objects
    -posso fare array di numeri sia int che double SI */
	double [] arrNum = {50, 24.59, 2.7578, 1, 19.1};
	
//CONVERSIONE IMPLICITA ED ESPLICITA
	/*ESPLICITA(cast) tipo più grande dentro tipo più piccolo
	è forzata. Comporta perdita informazioni.(di solito si usa per mettere decimale in un intero)
	IMPLICITA tipo più piccolo dentro tipo più grande*/
	int n1=25;
	int n2=10;
	int res=n1/n2;//-->valore di espressione
	//sarebbe  25:10=2.5 però essendo un int esce solo 2.0 PERDITA DI DATI
	double resD =n1/n2; //esce sempre 2.0. Perdo 0.5 perchè Java prima divide i 2 interi e poi trasforma il risultato in double
	double reD2 = (double)n1/(double)n2; //NON ho perdita di dati.CONVERSIONE ESPLICITA
	int n3=25;
	long l2 = n3;//CONVERSIONE IMPLICITA
	//short s=l2;N0. Sto mettendo un long di 64bit dentro uno short di 16bit
    short s1= (short) l2;
    
    //divisione tra double e int è sempre double
    double dd = 24.45;
	int ii = 5;
	double ris =dd/ii;
	//int ris =dd/ii;NO
	int risul = (int) (dd/ii); //prima eseguo divisione e poi converto risultato
	
	
	
	
//OPERATORI
	/*
	-1 aritmetici + - * / % ++ -- += -= *= /= %=
	-2 relazionali > < >= <= == !=
	-3 condizionali && || ! 
	*/
	
//ISTRUZIONI
	/*
	-singola riga es: int i = 10;
	-blocco {} es: modulo oppure{int i =12; double d= 24;}
	*/
	
	
	
//SCANNER
  //serve per ricevere dati in input. Posso ricevere qualsiasi tipo di dato ma la console legge sempre una stringa
 Scanner sc= new Scanner(System.in);	
 // new perchè è na classe
 System.out.println("scrivi nome");
 String nome = sc.nextLine();
 System.out.println("scrivi età");
 int eta =sc.nextInt();
 sc.nextLine(); // metto nextLine() ogni volta che non ho un nextLine(). Serve per svuotare il buffer.
 System.out.println("scrivi città");
 String citta = sc.nextLine();
 sc.close();
 System.out.println(nome + " ha " + eta + " anni e vive a " + citta);
 

 /*
  next serve per prendere valore
  nextLine()
  nextInt()
  nextDouble() 
  nextFloat()
  next()
  DEVE ESSERCI SOLO 1 SCANNER CONDIVISO tra tutte le istanze della classe
  quindi lo metto STATIC*/
	
	}

}
