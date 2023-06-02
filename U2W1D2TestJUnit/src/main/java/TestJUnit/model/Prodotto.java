package TestJUnit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Prodotto {


		
		private String marca;
		private String modello;
		private double prezzo;

	}

