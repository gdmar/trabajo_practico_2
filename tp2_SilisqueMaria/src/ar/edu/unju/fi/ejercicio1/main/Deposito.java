package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.categoria;
import ar.edu.unju.fi.ejercicio1.model.Producto.origenFabricacion;

public class Deposito {
	
	static Scanner sc = new Scanner(System.in);
	public static List<Producto>productos = new ArrayList<>();
	public static String codigo;
	
	
	public static void modificarProducto() {
		datoABuscar();
		int indice = buscaIndice();
		productos.set(indice, datosAModificar());
	}

	public static  Producto datosAModificar() { 
		System.out.print("ingrese descripcion del producto ");
		String descripcion = sc.next();
		System.out.print("ingrese precio Unitario del producto ");
		float preciou = sc.nextFloat();
		sc.nextLine();
		System.out.println("------------- Origen de Fabricacion -------------- ");
		Producto.listaOrigenFabricacion();
		origenFabricacion o = elecciondeFabrica();
		
		Producto p = new Producto(codigo,descripcion,preciou,o,dat());
		return p;
	}
	public static categoria dat() {
		int indice = buscaIndice();
		for(int i=0; i<productos.size();i++) {
			if (i==indice) {
				Producto p = productos.get(i);
				return p.getCat();
			}
		}
		return null;
	}
	
	public static int buscaIndice() {
		//System.out.println(codigo);
		for(int i=0; i<productos.size();i++) {
		Producto p = productos.get(i);
			if(p.getCodigo().equals(codigo)) {
				return i;
			}
		}
		return -1;
	}
	public static void datoABuscar() {
		System.out.print("ingrese codigo a buscar");
		codigo=sc.next();
	}
	
	
	public static void mostrar() {
		System.out.println(productos.size());
		for (int i=0 ;i< productos.size(); i++) {
			System.out.println(productos.get(i));
		}
	}
	public static void crearProducto() {
		productos.add(datosAIngresar());
	
	}
	public static  Producto datosAIngresar() {
		System.out.print("ingrese codigo del producto ");
		String codigo = sc.next();
		System.out.print("ingrese descripcion del producto ");
		String descripcion = sc.next();
		 sc.nextLine();
		float preciou=0;
		
			try {
				System.out.print("ingrese precio Unitario del producto ");
				 preciou = sc.nextFloat();
			
				
			} catch (Exception e) {
				System.out.println("precio invalido");
			}
		
			 sc.nextLine();
		
		System.out.println("------------- Origen de Fabricacion -------------- ");
		Producto.listaOrigenFabricacion();
		origenFabricacion o = elecciondeFabrica();
		System.out.println("--------------- categoria ------------ ");
		Producto.listaCategoria();
		categoria v = elejirCategoria();
		
		Producto p = new Producto(codigo,descripcion,preciou,o,v);
		return p;
	}
	public static categoria elejirCategoria() {
		categoria c = null;
		System.out.print("elija una opcion : ");
		int opc = sc.nextInt();
		switch (opc ) {
		case 1: c = categoria.TELEFONIA ;break;
		case 2: c= categoria.INFORMATICA;break;
		case 3: c= categoria.ELECTROHOGAR;break;
		case 4: c= categoria.HERRAMIENTAS;break;
		case 5 :System.out.println(" no es una opcion");
		}
		return c;
	}
	
	public static origenFabricacion elecciondeFabrica() {
		
		origenFabricacion var = null ;
		System.out.print("elija una opcion : ");
		int opc = sc.nextInt();
		switch (opc ) {
		case 1:  var = origenFabricacion.ARGENTINA;break;
		case 2:  var= origenFabricacion.CHINA;break;
		case 3: var= origenFabricacion.BRASIL;break;
		case 4: var= origenFabricacion.URUGUAY;break;
		case 5 :System.out.println(" no es una opcion");
		}
		 return var;
	}
	
}
