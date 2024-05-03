package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Deposito.precarga();
		 int opcion;
			do {
	 			System.out.println("----------------------- MENU ----------------------------------------------------");
	 			System.out.println("1  Mostratrar producto (estado true)");
	 			System.out.println("2  Mostrar producto faltantes (estado false)  ");
	 			System.out.println("3  incrementar los precios un 20%  ");
	 			System.out.println("4  Mostrar los productos que correspondan a la categoria Electrohogar y que esten disponibles ");
	 			System.out.println("5  Ordenar los productos por precio de forma decendente ");
	 			System.out.println("6  Mostrar los productos con los nombres en mayusculas");
	 			System.out.println("7  salir");
	 			System.out.println("----------------------------------------------------------------------------------");
	 			//sc.nextLine();
	 			System.out.println("ingrese opcion ");
	 			 opcion = sc.nextInt();
	 			 switch(opcion) {
	 			 case 1:Deposito.mostrarProducto();;break;
	 			 case 2:Deposito.filtrarProducto() ; break;
	 			 case 3:Deposito.incremetoDePrecio();; break;
	 			 case 4:Deposito.mostrarCategoria(); break;
	 			 case 5: ;break;
	 			 case 6: break;
	 			 case 7: System.out.println("FIN DEL PROGRAMA");break;
	 			 default :System.out.println("opcion incorrecta ");
	 				
	 			 }
	 			
	 		}while(opcion != 7);
sc.close();
	} 
	
}
