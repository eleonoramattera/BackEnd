package TeoriaPratica;

import java.util.GregorianCalendar; // classe java per gestire le date
                                    // mi permette di creare oggetti di tipo GregorianCaledar

public class DateOre2 {
	
public static void main(String[] args) {
	
	GregorianCalendar dataAttuale = new GregorianCalendar();
	// così gli oggetti che creo hanno le stette proprietà e metodi della classe GregorianCalendar
	int anno = dataAttuale.get(GregorianCalendar.YEAR);
	System.out.println(anno);
	int mese = dataAttuale.get(GregorianCalendar.MONTH)+1; // perchè mesi partono da 0
	int giornoMese = dataAttuale.get(GregorianCalendar.DATE);
	int giornoSettimana = dataAttuale.get(GregorianCalendar.DAY_OF_WEEK);
	
	
	GregorianCalendar data1 = new GregorianCalendar(2020, 0, 1);
	
}
}
