package librerieJavaTeoria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainLibreria {

	public static void main(String[] args) {
/* Uno dei maggiori punti di forza di Java è l'ECOSISTEMA DI LIBRERIE 
 UN PACKEAGE PIENO DI CLASSI CON CODICI GIA' PRONTI SCRITTI DA ALTRI SVILUPPATORI
 io devo prendere queste dipendenze libreire ed aggiungerele all'app.(tipo React)
 Librerie:
 
 un app può includere un numero variabile di librerie ovver FILE CON ESTENSIONI .jar
 Lo importo e le uso come se fossero classi scritte da me.
 
 Lo sviluppatore puo usare librerie di terze parti ma creare anche proprie librerie
 SCOPO
 RIUTILIZZARE IL CODICE E RENDERLO MODULARE E RIUTILIZZABILE
 ogni sviluppatore ha un set di librerie personale e un set di librerie esterne
	 
(npm è un gestore di dipendenze per js)
IMPORTARE LIBRERIE ESTERNE
-scaricare https://mvnrepository.com Maven. Jar(archivio Java) tipo zip, file compresso
-LogBack per errori (configurazione SLF4j)
	 
CARICARE LIBRERIA MANUALE
-creo cartella sorella di src
-tasto destro sul progetto. New Folder. Lib	
-per renderle disponibili. le sleleziono. Build Path. add to build Path.
-mi crea cartela Referenced Libraries
-questo solo per questo progetto. in un altro progetto devo riferlo


CONFIGURARE LOGBACK
per dire come gestire file di log

A COSA SERVE?
Per avere log più completi
	 */
		
	Logger log = LoggerFactory.getLogger(MainLibreria.class);
		
	log.info("TestLoggerInfo");	
	log.error("errore"); //evidenziati di rosso
	log.warn("Test Warning");
	log.debug("debug");

	}

}
