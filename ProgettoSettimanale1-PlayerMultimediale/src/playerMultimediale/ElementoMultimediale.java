package playerMultimediale;

public abstract class ElementoMultimediale {
   protected String title;

   
public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}



//COSTRUTTORI
public ElementoMultimediale() {
}

public ElementoMultimediale(String title) {
	this();
	this.title = title;
	}





}


