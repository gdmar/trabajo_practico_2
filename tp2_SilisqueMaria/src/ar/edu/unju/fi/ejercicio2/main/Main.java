package ar.edu.unju.fi.ejercicio2.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.main.Deposito;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("**********************- MENU -************************");
			System.out.println("1- CREAR EFEMERIDE");
			System.out.println("2- MOSTRAR EFEMERIDE ");
			System.out.println("3- ELIMINAR EFEMERIDE");
			System.out.println("4- MODIFICAR EFEMERIDE");
			System.out.println("5- SALIR");
			System.out.println("******************************************************");
			System.out.print("ingrese opcion ");
			 opcion = sc.nextInt();
			switch (opcion ) {
			case 1: Asistente.cargaEfemeride();;break;
			case 2: Asistente.mostrar();;break;
			case 3: Asistente.eliminarEfemeride();  break;
			case 4: Asistente.modificar();; break;
			case 5: System.out.println("SALISTE DEL PROGRAMA ");
			}
			
		}while (opcion != 5);

	}

}
