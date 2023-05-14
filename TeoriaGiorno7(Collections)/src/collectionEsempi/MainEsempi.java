package collectionEsempi;

import java.util.ArrayList;
import java.util.List;

public class MainEsempi {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		//AGGIUNGERE ELEMENTO
		list.add("primo elem");
		System.out.println(list.add("primo elem"));
		//oppure
		boolean elemUno = list.add("primo elem");
		System.out.println(elemUno);
		
		//AGGIUNGERE CON INDEX
		list.add(0, "elem nuovo");
		list.forEach(l -> System.out.println(l));
		
		//AGGIUNGERE COLLECTION
		List<String> listNomi = new ArrayList<String>();
		listNomi.add("ele");
		listNomi.add("leyla");
		listNomi.add("roberta");
	
		list.addAll(listNomi);
		list.forEach(l -> System.out.println(l));
	}

	

}
