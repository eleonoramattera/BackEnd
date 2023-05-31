package beanConfigurationXML;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class TestXML {

		private String title;
		private String txt;
		
		public String readTxt() {
			return "TITOLO: " + title + " TESTO: " + txt;
		}
}
