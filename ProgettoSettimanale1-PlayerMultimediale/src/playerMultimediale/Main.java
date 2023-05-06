package playerMultimediale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Audio a =new Audio("Audio1", 5, 2);
		 Video v =new Video("Video1", 5, 2, 9);
     
 		Immagine ii = new Immagine ("Img1", 5);
 		//System.out.println(i);
 		// System.out.println("luminosità alzata " + i.alzaLuminosità(5));
 		 //System.out.println("luminosità abbassata " + i.abbassaLuminosità(10));
 		//i.show();
 		
 		ElementoMultimediale[] m =new ElementoMultimediale[5];
 		System.out.println(m);
 		for(int i =0; i<m.length; i++) {
 			System.out.println(m[i]);
 		}
 		inserisci(m);
 		

}
	
	public static void inserisci(ElementoMultimediale[] m) {
	for(int i=0; i<=2; i++) {
		Scanner s = new Scanner(System.in);
		System.out.println("AGGIUNGI FILE:");
		System.out.println("Inserisci che tipo di elemento visualizzare: \n 1- immagine, 2-video, 3-audio");
 		int nTipologia =s.nextInt();
 		s.nextLine();
 		switch(nTipologia) {
 		case 1 :
 			System.out.println("hai selezionato IMMAGINE");
 			System.out.println("inserici titolo");
 			String titoloImg = s.nextLine();
 			System.out.println("iserisci luminosità");
 		    int luminositaImg = s.nextInt();
 		    s.nextLine();
 		    System.out.println("immagine aggiunta con successo");
 		    Immagine im = new Immagine (titoloImg,luminositaImg);
 		    m[i] = im; //inserisco immagine nell'array
 		    break;
 		case 2:
 			System.out.println("hai selezionato VIDEO");
 			System.out.println("inserisci titolo");
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
 			 System.out.println("video aggiunto con successo");
 			Video vid = new Video(titoloVideo, volumeVideo, durataVideo, luminVideo);
 			m[i]= vid;
 			break;
 		case 3:
 			System.out.println("hai selezionato AUDIO");
 			System.out.println("inserisci titolo");
 			String titoloAudio = s.nextLine();
 			System.out.println("inserisci volume");
 			int volumeAudio = s.nextInt();
 			s.nextLine();
 			System.out.println("inserisci durata");
 			double durataAudio = s.nextDouble();
 			s.nextLine();
 			Audio aud = new Audio(titoloAudio, volumeAudio, durataAudio);
 			m[i]= aud;
 			System.out.println("audio aggiunto con successo");
 			break;
 		default:
 			System.out.println("tipo non valido. Riprova");
 		}
 		}
	
		
		
		
		
	}
}
