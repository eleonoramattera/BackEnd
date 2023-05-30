package configurationBean;

//è una classe POJO quindi non pu esternere altre classi predefinite,
//non può implementare interfacce predefinite
public class Test {

	private String txt;
	
	private String readTxt() {
		return "Testo Test " + txt;	}
}
