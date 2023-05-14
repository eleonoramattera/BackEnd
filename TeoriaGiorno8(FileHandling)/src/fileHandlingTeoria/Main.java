package fileHandlingTeoria;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

static	File file = new File("testFile/text.txt");
	public static void main(String[] args) {
	/*
	 salvare e leggere dati da un file. es fare backup
	 importare file da excel
	 condividerer dati tramite file
	 sritture e lettura dei darti su file
	 uso una libreria una dipendenza Apache commons*/
		try {
			scriviSuFile("Test scrittura!!!");
			String s = leggiDaFile();
			//System.out.println(s);
			//cancellaFile();
			//cancellaDir();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		public static void scriviSuFile(String s) throws IOException {
			FileUtils.writeStringToFile(file, s, "UTF-8", true);
			System.out.println("Testo scritto su file");
		}
		
		public static String leggiDaFile() throws IOException {
			return FileUtils.readFileToString(file, "UTF-8");
		}
		
		public static void cancellaFile() throws IOException {
			FileUtils.deleteQuietly(file);
			System.out.println("File eliminato!!!");
		}
		
		public static void cancellaDir() throws IOException  {
			FileUtils.deleteDirectory(new File("testFile/"));
			System.out.println("Directory eliminato!!!");
		}
	

}
