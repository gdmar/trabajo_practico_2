package ar.edu.unju.fi.ejercicio1.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("**********************- MENU -************************");
			System.out.println("1- CREAR PRODUCTO");
			System.out.println("2- MOSTRAR PRODUCTOS ");
			System.out.println("3- MODIFICAR PRODUCTO");
			System.out.println("4- SALIR");
			System.out.println("******************************************************");
			System.out.print("ingrese opcion ");
			 opcion = sc.nextInt();
			switch (opcion ) {
			case 1: Deposito.crearProducto();break;
			case 2: Deposito.mostrar();break;
			case 3: Deposito.modificarProducto();  break;
			case 4: System.out.println("SALISTE DEL PROGRAMA ");
			}
			
		}while (opcion != 4);
			
		

	}

}
