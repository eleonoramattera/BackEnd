package playerMultimediale;

public class Audio extends ElementoMultimediale implements RegolazioneVolume, Riproduci{
	private int volume;
	private double durata;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public double getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}


	//COSTRUTTORI
	public Audio() {
	}
	
	public Audio(String title, int volume, double durata) {
		super(title);
		this.volume= volume;
		this.durata = durata;
	}

	
	
	
	//metodi
	public String toString() {
	    return ("nome audio: " + title + " volume audio : " + volume + " durata: " + durata);
	}
	
	
	@Override
	public int alzaVolume(int volume) {
	 return volume +1;
	};
	@Override
	public int abbassaVolume(int volume) {
	return volume -1;
}

	@Override
	public void play() {
		for(int i=0;i<durata;i++) {
			System.out.print(title);
			for (int j=0;j<volume;j++) {
				System.out.print("!");
		 }
			System.out.println("");
		 }
		}		
	



	
	
}
