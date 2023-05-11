package playerMultimediale;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainProject {

static Scanner s = new Scanner(System.in);
static ArrayList<ElementoMultimediale> elementiArr = new ArrayList<>();
	
	public static void main(String[] args) throws InputMismatchException {
		boolean end =false;
		do {
	try {
	  for (int e = 0; e < 5; e++) {
        System.out.println("AGGIUNGI FILE:");
     	System.out.println("Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
		           
     	int nTipologia =s.nextInt();
     	if (nTipologia != 1 || nTipologia != 2 || nTipologia != 3) {
			System.out.println("Valore non valido. Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
		}
		s.nextLine();

		
		switch(nTipologia) {
		
		case 1 :
			System.out.println("hai selezionato IMMAGINE");
			System.out.println("inserici titolo");
	 		String titoloImg = s.nextLine();
			System.out.println("iserisci luminosità");
		    int luminositaImg = s.nextInt();
		    s.nextLine();
		    Immagine im = new Immagine (titoloImg,luminositaImg);
     	    System.out.println("Hai aggiunto: \n " + "NOME IMMAGINE: " + im.getTitle() + " LUMINOSITA:' " + im.getLuminosità());
	        elementiArr.add(im);
     	    break;
		    
		case 2:
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
			int luminVideo = s.nextInt(); elementiArr.add(vid);
			s.nextLine();
			Video vid = new Video(titoloVideo, volumeVideo, durataVideo, luminVideo);
			System.out.println("hai aggiunto: \n " + "TITOLO VIDEO: " + vid.getTitle() + " VOLUME: " + vid.getVolume() + " DURATA: " + vid.getDurata() + " LUMINOSITA' " + vid.getLuminosità());
			 
			break;
			
		case 3:
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
			break;
		 
		case 0: end=true; break;
		
		default:
			System.out.println("tipo non valido. Riprova");
			break;
		}//fine switch
		
	
}//chiusura for

}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("array pieno");	
}catch(InputMismatchException e) {
		System.out.println("valore non corretto");
		System.out.println("Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
		int nTipologia =s.nextInt();
	}
       
		        
		          
    int scelta = 0;
 while (true) {
 System.out.println(" SCEGLI COSA RIPRODURRE (Hai 5 Elementi) 0 per uscire");
 scelta = s.nextInt();

		if (scelta > 0 && scelta <= 5) {
		    if (elementiArr.get(scelta-1) instanceof Immagine) {
		        switch (elementiArr.get(scelta-1)) {
		            case AUDIO ;
		            case VIDEO ;
		        }
		    } else {
		        Immagine.show((Immagine) elementiArr.get(scelta-1));
		    }
		    } else {

		       
		        System.exit(0);
		    }
		}        

		    

}}

	
}