package ar.edu.unju.fi.ejercicio4.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
		try {
			 int opcion;
		 		do {
		 			System.out.println("----------------------- MENU ----------------------------------------------------");
		 			System.out.println("OPCION 1 Alta de jugador");
		 			System.out.println("OPCION 2: Mostrar todos los jugadores  ");
		 			System.out.println("OPCION 3: Modificar la posicion de un jugador  ");
		 			System.out.println("OPCION 4: Eliminar un jugador  ");
		 			System.out.println("OPCION 5: SALIR ");
		 			System.out.println("----------------------------------------------------------------------------------");
		 			//sc.nextLine();
		 			System.out.println("ingrese opcion ");
		 			 opcion = sc.nextInt();
		 			 switch(opcion) {
		 			 case 1:ManagerJugador.altaJugador();break;
		 			 case 2:ManagerJugador.mostrarjugadores(); break;
		 			 case 3:ManagerJugador.modificar(); break;
		 			 case 4:ManagerJugador.eliminar(); break;
		 			 case 5: System.out.println("FIN DEL PROGRAMA");
		 				
		 			 }
		 			
		 		}while(opcion != 5);
		} catch (Exception e) {
			System.out.println("OPCION INCORRECTA ");
		}
        
sc.close(); 		
}

}
