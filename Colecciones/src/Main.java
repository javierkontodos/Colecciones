import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set coleccionSet = new HashSet();
		
		coleccionSet.add("Piratas del Caribe");
		
		coleccionSet.add("Rompe Ralph");
		
		coleccionSet.add("ViWei: El Destino Llama a tu Puerta");
		
		coleccionSet.add("Los Vengadores");
		
		for (Object elemento : coleccionSet) {
			System.out.println(elemento);
		}
	}

}
