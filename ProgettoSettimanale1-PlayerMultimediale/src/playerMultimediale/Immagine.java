package playerMultimediale;

public class Immagine extends ElementoMultimediale implements RegolazioneLuminosità {
    private static int luminosità;

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}
    
	//COSTRUTTORI
	public Immagine() {
	};
	
	public Immagine(String title, int luminosità) {
		super(title, Tipo.IMMAGINE);
		this.luminosità = luminosità;
	}
	
	//metodi
	public String toString() {
	    return ("nome immagine: " + title + " luminosità " + luminosità);
	}

	@Override
	public int alzaLuminosità(int luminosità) {
		return luminosità+1;
	}

	@Override
	public int abbassaLuminosità(int luminosità) {
		return luminosità-1;
	}
	
	public static  void show() {
		System.out.print(title);
		for (int i=0; i<luminosità; i++) {
			System.out.print("!");
		}
	}
}
