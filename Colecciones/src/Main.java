import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//Crea una coleccion de tipo Set, los repetidos no se guardaran
		Set coleccionSet = new HashSet();
		
		coleccionSet.add("Piratas del Caribe");
		
		coleccionSet.add("Rompe Ralph");
		
		coleccionSet.add("ViWei: El Destino Llama a tu Puerta");
		
		coleccionSet.add("Los Vengadores");
		
		for (Object elemento : coleccionSet) {
			//if(elemento instanceof String)
				//String texto = (String) elemento;
			System.out.println(elemento);
		}
	}

}
