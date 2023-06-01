package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Franchise {

	private String nome;
	private double prezzo;
	
	public String getFranchise() {
		return this.nome + " " +  this.prezzo;
	}
}
