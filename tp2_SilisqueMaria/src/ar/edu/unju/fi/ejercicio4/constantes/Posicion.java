package ar.edu.unju.fi.ejercicio4.constantes;

public enum Posicion {
	DELANTERO,
	MEDIO,
	DEFENSA,
	ARQUERO;
	
	public static  void listaPosicion() {
   	 int cont =1;
		for (Posicion i :Posicion.values()){
			System.out.println(cont+" - " + i);
			cont++;
		}
	}

}
