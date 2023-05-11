package playerMultimediale;

public abstract class ElementoMultimediale {
   protected static String title;
   protected static Tipo tipo;
   
public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}



//COSTRUTTORI
public ElementoMultimediale() {
}

public ElementoMultimediale(String title, Tipo tipo) {
	this();
	ElementoMultimediale.title = title;
	ElementoMultimediale.tipo = tipo;
	}

public void play() {
	// TODO Auto-generated method stub
	
}






}


