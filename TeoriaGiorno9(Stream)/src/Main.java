import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
        //Stream di Collection
		Collection<String> c1 =new ArrayList<String>();
		List<String> c2 =new ArrayList<String>();
        List<String> c3 = Arrays.asList("epicode", "test", "abc");
		
		// Stream di Array
		String[] arrStr = {"epicode", "test", "abc" };
		//devo trasformare array in un elemento steammabile sul quale posso effettuare operazioni di stream. collection gia sono native
		// trasfrmare array in oggetti in grado di essere manipolati
		//Arrays è una classe che manipola gli array
		Stream<String> streamArr = Arrays.stream(arrStr);
		
		
		// Stream tramite builder
		Stream<String> streamBuild =  Stream.<String>builder()
														.add("test")
														.add("epicode")
														.add("abc").build();
		
		
	}

}
