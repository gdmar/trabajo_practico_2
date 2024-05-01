package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
	
		FelinoSalvaje pantera = new FelinoSalvaje("Tanner ", (byte) 20, 186);
		Converter< FelinoSalvaje, FelinoDomestico> convertir = x -> new FelinoDomestico(x.getNombre(), x.getEdad(), x.getPeso());
		if(Converter.isNotNull(pantera)) {
			FelinoDomestico felino1 = convertir.convert(pantera);
			convertir.mostrarObjeto(felino1);

		}else {
			System.out.println("es nulo ");
		}
		
	}

}
