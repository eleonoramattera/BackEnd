//package playerMultimediale;
//
//
//
//	import java.util.InputMismatchException;
//	import java.util.Scanner;
//
//	public class Main {
//
//		static Scanner s = new Scanner(System.in);
//		
//		public static void main(String[] args) {
//			Audio a =new Audio("Audio1", 5, 2);
//			 Video v =new Video("Video1", 5, 2, 9);
//	         Immagine ii = new Immagine ("Img1", 5);
//	 		//System.out.println(i);
//	 		// System.out.println("luminosità alzata " + i.alzaLuminosità(5));
//	 		 //System.out.println("luminosità abbassata " + i.abbassassLuminosità(10));
//	 		//i.show();
//	 		
//	 		ElementoMultimediale[] m =new ElementoMultimediale[5];
////	 		try {
// 			inserisci(m);
////	 		}catch(InputMismatchException e) {
////	 			System.out.println("valore non corretto");
////	 			System.out.println("Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
////	 			int nTipologia =s.nextInt();
////	 		}
////	 		
//	 
//	 	 
//	}
//		
//  public static void inserisci(ElementoMultimediale[] m) throws InputMismatchException {
//			boolean end =false;
//			do {
//		try {
//			ElementoMultimediale m1 []= new ElementoMultimediale[5];
//		
//		for(int i=0; i<=m1.length; i++) {
//			System.out.println("AGGIUNGI FILE:");
//			System.out.println("Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
//			int nTipologia =s.nextInt();
////	 		if (nTipologia != 1 || nTipologia != 2 || nTipologia != 3) {
////	 			System.out.println("Valore non valido. Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
////	 		}
//	 		s.nextLine();
//	
//	 		
//	 		switch(nTipologia) {
//	 		
//	 		case 1 :
//	 			System.out.println("hai selezionato IMMAGINE");
//	 			System.out.println("inserici titolo");
//	 	 		String titoloImg = s.nextLine();
//	 			System.out.println("iserisci luminosità");
//	 		    int luminositaImg = s.nextInt();
//	 		    s.nextLine();
//	 		    Immagine im = new Immagine (titoloImg,luminositaImg);
// 	     	    System.out.println("Hai aggiunto: \n " + "NOME IMMAGINE: " + im.getTitle() + " LUMINOSITA:' " + im.getLuminosità());
// 		        m1[i] = im; //inserisco immagine nell'array  
// 		        break;
//	 		    
//	 		case 2:
//	 			System.out.println("hai selezionato VIDEO");
//	 			System.out.println("inserici titolo");
//	 	 		String titoloVideo = s.nextLine();
//	 			System.out.println("inserisci volume");
//	 			int volumeVideo = s.nextInt();
//	 			s.nextLine();
//	 			System.out.println("inserisci durata");
//	 			double durataVideo = s.nextDouble();
//	 			s.nextLine();
//	 			System.out.println("inserisci luminosità");
//	 			int luminVideo = s.nextInt();
//	 			s.nextLine();
//	 			Video vid = new Video(titoloVideo, volumeVideo, durataVideo, luminVideo);
//	 			System.out.println("hai aggiunto: \n " + "TITOLO VIDEO: " + vid.getTitle() + " VOLUME: " + vid.getVolume() + " DURATA: " + vid.getDurata() + " LUMINOSITA' " + vid.getLuminosità());
//	 			m1[i]= vid;
//	 			break;
//	 			
//	 		case 3:
//	 			System.out.println("hai selezionato AUDIO");
//	 			System.out.println("inserici titolo");
//	 	 		String titoloAudio = s.nextLine();
//	 			System.out.println("inserisci volume");
//	 			int volumeAudio = s.nextInt();
//	 			s.nextLine();
//	 			System.out.println("inserisci durata");
//	 			double durataAudio = s.nextDouble();
//	 			s.nextLine();
//	 			Audio aud = new Audio(titoloAudio, volumeAudio, durataAudio);
//	 			System.out.println("hai aggiunto: \n " + "TITOLO AUDIO: " + aud.getTitle() + " VOLUME: " + aud.getVolume() + " DURATA: " + aud.getDurata());
//	            m1[i]= aud;
//	            break;
//	 		case 0: end=true; break;
//	 		default:
//	 			System.out.println("tipo non valido. Riprova");
//	 			i--;
//	 			break;
//	 		}//fine switch
//	 		
//	 		for(int j =0; j<m1.length; j++) {
//	 			System.out.println("ELEMENTI INSERITI: " + m1[j]);
//	 		}
//	    }//chiusura for
//		
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("array pieno");	
//		}catch(InputMismatchException e) {
// 			System.out.println("valore non corretto");
// 			System.out.println("Inserisci che tipo di elemento inserire: \n 1- immagine, 2-video, 3-audio");
// 			int nTipologia =s.nextInt();
// 		}
//		
//		
//	
//		
//		int elemento = 1;
//		
//		while(true) {
//		    System.out.println("SCEGLI QUALE ELEMENTO RIPRODURRE. PREMI 0 per uscire ");
//			elemento =  s.nextInt();
//			
//			if(elemento > 0 && elemento-1 < m.length) {
//				ElementoMultimediale arrElems = m[0];
//		
//				
//   			if(arrElems instanceof Immagine) {
//					Immagine img = (Immagine)arrElems;
//					img.show();
//					
//				}else if(arrElems instanceof Audio) {
//					Audio aud = (Audio)arrElems;
//					aud.play();
//					
//				}else if(arrElems instanceof Video) {
//					Video vid = (Video)arrElems;
//					vid.play();
//					
//				}else{
//					System.out.println("l'elemento che cerchi non è corretto");
//				}
//			
//			}else if(elemento == 0){
//				System.out.println(" sei uscito ");
//				s.close();
//			}
//			
//		}
//			}while(!end);
//		
//  
//  
//  }
//}    
