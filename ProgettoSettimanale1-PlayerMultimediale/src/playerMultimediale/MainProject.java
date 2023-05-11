package playerMultimediale;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainProject {

static Scanner s = new Scanner(System.in);
static ArrayList<ElementoMultimediale> elementiArr = new ArrayList<>();
	
	public static void main(String[] args) throws InputMismatchException {
		boolean end =false;
		int nTipologia = 0;
		do {
	try {
	  for (int e = 0; e < 5; e++) {
        System.out.println("AGGIUNGI FILE:");
     	System.out.println("Inserisci TIPO elemento: \n 1- IMMAGINE, 2-VIDEO, 3-AUDIO");
		           
     	 nTipologia =s.nextInt();
     	if (nTipologia != 1 || nTipologia != 2 || nTipologia != 3) {
			System.out.println("Valore non valido. Inserisci TIPO elemento: \n 1- IMMAGINE, 2-VIDEO, 3-AUDIO");
		}
		s.nextLine();

		if(nTipologia == 1) {
			System.out.println("hai selezionato IMMAGINE");
			System.out.println("inserici titolo");
	 		String titoloImg = s.nextLine();
			System.out.println("iserisci luminosità");
		    int luminositaImg = s.nextInt();
		    s.nextLine();
		    Immagine im = new Immagine (titoloImg,luminositaImg);
    	    System.out.println("Hai aggiunto: \n " + "NOME IMMAGINE: " + im.getTitle() + " LUMINOSITA:' " + im.getLuminosità());
		} else if (nTipologia ==2) {
			System.out.println("hai selezionato VIDEO");
			System.out.println("inserici titolo");
	 		String titoloVideo = s.nextLine();
			System.out.println("inserisci volume");
			int volumeVideo = s.nextInt();
			s.nextLine();
			System.out.println("inserisci durata");
			double durataVideo = s.nextDouble();
			s.nextLine();
			System.out.println("inserisci luminosità");
			int luminVideo = s.nextInt(); 
			s.nextLine();
			Video vid = new Video(titoloVideo, volumeVideo, durataVideo, luminVideo);
			System.out.println("hai aggiunto: \n " + "TITOLO VIDEO: " + vid.getTitle() + " VOLUME: " + vid.getVolume() + " DURATA: " + vid.getDurata() + " LUMINOSITA' " + vid.getLuminosità());	 
		} else if (nTipologia == 3){
			System.out.println("hai selezionato AUDIO");
			System.out.println("inserici titolo");
	 		String titoloAudio = s.nextLine();
			System.out.println("inserisci volume");
			int volumeAudio = s.nextInt();
			s.nextLine();
			System.out.println("inserisci durata");
			double durataAudio = s.nextDouble();
			s.nextLine();
			Audio aud = new Audio(titoloAudio, volumeAudio, durataAudio);
			System.out.println("hai aggiunto: \n " + "TITOLO AUDIO: " + aud.getTitle() + " VOLUME: " + aud.getVolume() + " DURATA: " + aud.getDurata());
			  elementiArr.add(aud);	
		}

}//chiusura for

}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("array pieno");	
}catch(InputMismatchException e) {
		System.out.println("valore non corretto");
		System.out.println("Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
		 nTipologia =s.nextInt();
	}
       
		        
		          
    int scelta = 0;
 System.out.println(" SCEGLI COSA RIPRODURRE (Hai 5 Elementi) 0 per uscire");
 scelta = s.nextInt();

	
		if (scelta > 0 && scelta <= 5) 
			switch(scelta) {
			case 1: 
				if (nTipologia ==1) {
				elementiArr.get(scelta-1);
				Immagine.show();
				}
			case 2: 
				if (nTipologia ==2) {
				elementiArr.get(scelta-1);
				Video video = new Video();
				video.play();
				}
			case 3: 
				if (nTipologia ==3) {
				elementiArr.get(scelta-1);
				Audio audio = new Audio();
				audio.play();
				}
							
				
			
			
			}
		   
		
	}while (!end); 

		    

}

	
}