package ar.edu.unju.fi.ejercicio3.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.fi.ejercicio3.constantes.Provincia;

public class Main {

	public static void main(String[] args) {
		List<Provincia>provincias = List.of(Provincia.values())  ;  //genera una lista a partir de un arreglo.
		
		for (Provincia i:provincias ) {
			i.mostrar();
		}
	}

}
