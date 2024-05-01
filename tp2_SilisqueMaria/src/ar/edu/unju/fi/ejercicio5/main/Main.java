package ar.edu.unju.fi.ejercicio5.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deposito.precargaProductos();
			String opcion;
			do {
				System.out.println("**********************- MENU -************************");
				System.out.println("1- MOSTRAR PRODUCTOS ");
				System.out.println("2- REALIZAR COMPRA ");
				System.out.println("3- SALIR");
				System.out.println("******************************************************");
				System.out.print("ingrese opcion ");
				 opcion = sc.next();
				switch (opcion ) {
				case "1":Deposito.mostarProducto() ;break;
				case "2": Deposito.comprarProducto();break;
				case "3": System.out.println("SALISTE DEL PROGRAMA ");
				default:System.out.println("opcion incorrecta");
				}
				
			}while (!opcion.equals("3"));
		
		
		
			
sc.close();
	}

}
