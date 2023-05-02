package javaIntro;



import java.util.Scanner;

public class FirstProjectEsempiTeoria {

	public static void main(String[] args) {
	System.out.println("ciao"); //console.log

	
	boolean b = true;
	int i = 25;
	char a = 25; // converte in ashii
	char c = 'c';
	float f = 23.2f;
	double d = 25.46;
	String s ="ciao"; // è equiparato a un dato primitivo primitivo
	// ma avrei dovuto fare
	//String srt = new String(); // perchè è un oggetto, classe

	//array
	// tipo nome []
	int arrInteri [] = new int[5];
// array non è un elemento primitivo quindi new tipo e lenght perchè mi deve riservare uno spazio in memoria
// in questo caso spazio occupato da int x5
// devo sapere necessaiamente lenght
	arrInteri[0] =23;
	arrInteri[1] =23;
	arrInteri[2] =23;
	arrInteri[3] =23;
	arrInteri[4] = 45;
	
	System.out.println(arrInteri.length);
	//se già conosco elemtenti interni arr
	String sett[] = {"lun", "mar", "merc"};
	System.out.println(sett.length);
	}
	//forLoop si usa allo stesso modo
	//matrici sono array di array (array bidimensionali)
	
	//array misto di stringhe e numeri non lo posso fare. potrei dare array di object
	//posso fare array di numeri sia int che double

}
