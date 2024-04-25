package ar.edu.unju.fi.ejercicio2.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.constatntes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

public class Asistente {
	static Scanner sc = new Scanner(System.in);
	public static List<Efemeride>eventos = new ArrayList<>();
	public static String codigo;
	
	public static void modificar() {
		datoABuacar();
		int indice=buscarIndice();
		eventos.set(indice, datosEfemeride());
	}
	public static void eliminarEfemeride() {
		datoABuacar();
		int indice=buscarIndice();
		eventos.remove(indice);
	}
	public static int buscarIndice() {
		for(int i=0; i<eventos.size();i++) {
			Efemeride e = eventos.get(i);
			if(e.getCodigo().equals(codigo)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void datoABuacar() {
		System.out.print("ingrese codigo a buscar");
		codigo = sc.next();
	}
	
	
	
	public static void mostrar() {
		for(int i=0;i<eventos.size();i++) {
			System.out.println(eventos.get(i));
		}
	}
	public static void cargaEfemeride() {
		eventos.add(datosEfemeride());
	}
	public static Efemeride datosEfemeride() {
		System.out.print("ingrese codigo de Efemeride");
		String codigo= sc.next();
		//System.out.print("ingrese codigo de Efemeride");
		Mes m = ingresoMes();
		System.out.print("ingrese dia ");
		int dia = sc.nextInt();
		System.out.print("ingrese detalles de Efemeride");
		String detalle = sc.next();
		Efemeride evento = new Efemeride(codigo,m,dia,detalle);
		return evento;
	}
	public static Mes ingresoMes() {
		Mes m =null;
		System.out.print("ingrese numero de MES ");
		int num = sc.nextInt();
		switch(num) {
		case 1: m= Mes.ENERO;break;
		case 2:m=Mes.FEBRERO;break;
		case 3:m=Mes.MARZO;break;
		case 4:m=Mes.ABRIL;break;
		case 5:m=Mes.MAYO;break;
		case 6:m=Mes.JUNIO;break;
		case 7:m=Mes.JULIO;break;
		case 8:m=Mes.AGOSTO;break;
		case 9:m=Mes.SEPTIEMBRE;break;
		case 10:m=Mes.OCTUBRE;break;
		case 11:m=Mes.NOVIEMBRE;break;
		case 12:m=Mes.DICIEMBRE;break;
		case 13: System.out.println("el numero no pertenese a un MES");
		}
		return m;
	}

}
