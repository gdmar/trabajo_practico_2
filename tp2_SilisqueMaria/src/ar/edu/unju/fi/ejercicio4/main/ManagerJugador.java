package ar.edu.unju.fi.ejercicio4.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto.categoria;
import ar.edu.unju.fi.ejercicio4.constantes.Posicion;
import ar.edu.unju.fi.ejercicio4.model.Jugador;

public class ManagerJugador {
	static Scanner sc = new Scanner(System.in);
	public static List<Jugador> jugadores = new ArrayList<>();
	public static String nombre;
	public static String apellido;
	/**
	 * Este método ELIMINA un jugador ingresando nombre y apellido.
	 *
	 */
	public static void eliminar() {
		datosParaModificar();
		Iterator<Jugador> iter = jugadores.iterator();
		while (iter.hasNext()) {
			Jugador j = iter.next();
			if (j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
				iter.remove();
			}
		}
	}
	/**
	 * Este método MODIFICA un jugador .
	 *
	 */

	public static void modificar() {
		datosParaModificar();
		int indice = buscarIndice();
		jugadores.set(indice, datosAmodificar());
	}
	/**
	 * Este método BUSCA el indice.
	 *
	 */

	public static int buscarIndice() {

		for (int i = 0; i < jugadores.size(); i++) {
			Jugador j = jugadores.get(i);
			if (j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
				return i;
			}
		}
		return -1;
	}

	public static Jugador datosAmodificar() {
		int indice = buscarIndice();

		System.out.println("+++++++++ POSICIONES +++++++++++++++ ");
		Posicion.listaPosicion();
		Posicion pos = elejirPosicion();
		Jugador j = new Jugador(nombre, apellido, jugadores.get(indice).getFechaNacimiento(),
				jugadores.get(indice).getNacionalidad(), jugadores.get(indice).getEstatura(),
				jugadores.get(indice).getPeso(), pos);
		return j;
	}

	public static void datosParaModificar() {
		System.out.print("INGRESE  NOMBRE DEL JUGADOR");
		nombre = sc.next();
		System.out.println("INGRESE APELLIDO DEL JUGADOR");
		apellido = sc.next();
	}
	/**
	 * Este método MUESTRA los jugadores.
	 *
	 */

	public static void mostrarjugadores() {
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println(jugadores.get(i));
		}
	}
	/**
	 * Este método carga jugadores.
	 *
	 */

	public static void altaJugador() {
		jugadores.add(datosJugador());
	}

	public static Jugador datosJugador() {
		boolean fechaIncorrecta = true;
		LocalDate fechaNacimiento = null;
		System.out.print("ingrese nombre del jugador ");
		String nombre = sc.next();
		System.out.print("ingrese apellido del jugador ");
		String apellido = sc.next();
		while (fechaIncorrecta) {
			try {
				System.out.println("ingrese fecha de nacimiento con formato 2024-12-28");
				String fecha = sc.next();
				System.out.println(fecha);
				fechaNacimiento = LocalDate.parse(fecha);
				fechaIncorrecta = false;
				// System.out.println(fechaNacimiento);
			} catch (Exception e) {
				System.out.println("Error en el formto debe ingresar con formato : 2024-12-28");
				fechaIncorrecta = true;
			}

		}
		;
		System.out.print("ingrese nacionalidad del jugador ");
		String nacionalidad = sc.next();
		System.out.print("ingrese estatura del jugador ");
		float estatura = sc.nextFloat();
		System.out.print("ingrese peso del jugador ");
		float peso = sc.nextFloat();

		System.out.println("+++++++++ POSICIONES +++++++++++++++ ");
		Posicion.listaPosicion();
		Posicion pos = elejirPosicion();
		Jugador j = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, pos);

		return j;

	}

	public static Posicion elejirPosicion() {
		Posicion p = null;
		System.out.print("elija posicion del jugador ");
		int pos = sc.nextInt();
		switch (pos) {
		case 1:
			p = Posicion.DELANTERO;
			break;
		case 2:
			p = Posicion.MEDIO;
			break;
		case 3:
			p = Posicion.DEFENSA;
			break;
		case 4:
			p = Posicion.ARQUERO;
			break;
		default:
			System.out.println("DEBE INGRESAR UNA DE LAS POSICIONES DISPONIBLES");
		}
		return p;
	}

}
