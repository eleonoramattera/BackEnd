package playerMultimediale;

public class Video extends ElementoMultimediale implements RegolazioneVolume, RegolazioneLuminosità, Riproduci {
	private static int volume;
	private static double durata;
	private int luminosità;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getDurata() {
		return durata;
	}
	public void setDurata(double durata) {
		this.durata = durata;
	}
	public int getLuminosità() {
		return luminosità;
	}
	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}
 
	//COSTRUTTORI
    public Video() {
    };
    
    public Video(String title, int volume, double durata, int luminosità) {
    	super(title, Tipo.VIDEO);
    	this.volume = volume;
    	this.durata = durata;
    	this.luminosità=luminosità;
    }
    
    public String toString() {
	    return ("nome video: " + title + " volume video : " + volume + " durata: " + durata + " luminosità " + luminosità);
	}
	
		

	@Override
	public int alzaVolume(int volume) {
		return  volume+1;
	}
	@Override
	public int abbassaVolume(int volume) {
		return  volume-1;
	}
	@Override
	public int alzaLuminosità(int luminosità) {
		return luminosità+1;
	}
	@Override
	public int abbassaLuminosità(int luminosità) {
      	return luminosità-1;
	}
	
	public void play() {
		for (int i = 0; i<durata; i++) {
			System.out.print(title);
		  for(int j = 0; j<volume; j++) {
			  System.out.print("!");
		  }
		  System.out.println();
		}
		  
		
	}
	
}
