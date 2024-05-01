package ar.edu.unju.fi.ejercicio5.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio5.model.PagoTarjeta;
import ar.edu.unju.fi.ejercicio5.model.Producto;
import ar.edu.unju.fi.ejercicio5.model.Producto.categoria;
import ar.edu.unju.fi.ejercicio5.model.Producto.origenFabricacion;

public class Deposito {
	static Scanner sc = new Scanner(System.in);
	public static List<Producto>productos = new ArrayList<>();
	public static List<Producto>compras =new ArrayList<>();
	
	public static PagoEfectivo pagoe = new PagoEfectivo();
	public static PagoTarjeta pagot ;
	
	public static void comprarProducto() {
		String salida;
		do {
			listarProductosEnStock();
			
			System.out.print("comprar s/n");
			 salida = sc.next();
			 System.out.println(salida);
			if(!salida.equals("n")) {
				System.out.println(" ingrese codigo del producto");
				String codigo = sc.next();
				   Producto b= buscar(codigo);
				if(b == null) {
					System.out.println("el producto no esta en stock");
				}else {
					agregarAlCarrito(b);
				}
			}
			 
		}while(!salida.equals("n")) ;
		
		if(compras.size()>0) {
			System.out.println("------METODOS DE PAGO ---------");
			System.out.println("1  PAGO EFECTIVO ");
			System.out.println("2  PAGO CON TARJETA");
			System.out.println("ingrese opcion ");
			int opc = sc.nextInt();
			switch(opc) {
			case 1:
					double montoE = totalmontoDeCompra();
					pagoe=cargarDatosParaPagoEfectivo();
					pagoe.realizarPago(montoE);
					pagoe.imprimirRecibo();
			
				
				break;
			case 2: 
					double monto = totalmontoDeCompra();
					pagot=cargardatosdeTarjeta();
					pagot.realizarPago(monto);
					pagot.imprimirRecibo();
					
				break;
				default:
					System.out.println("opcion incorrecta ");
			}
		}else {
			System.out.println("GRACIAS POR VISITAR");
		}
		
	
		
	
	}
	public static PagoEfectivo cargarDatosParaPagoEfectivo() {
		boolean fechaIncorrecta = true;
		LocalDate fecha =null;
		while (fechaIncorrecta) {
			try {
				System.out.print("ingrese fecha de compra ");
				String f=sc.next();
				 fecha = LocalDate.parse(f);
				fechaIncorrecta = false;
			} catch (Exception e) {
				System.out.println("Error en el formto debe ingresar con formato : 2024-09-28");
				fechaIncorrecta = true;
			}

		}
		PagoEfectivo p = new PagoEfectivo(fecha);
		return p;
	}
	
	public static PagoTarjeta cargardatosdeTarjeta() {
		boolean fechaIncorrecta = true;
		LocalDate fecha =null;
		System.out.print("ingrese numero de Tarjeta: ");
		String numero =sc.next();
		
		while (fechaIncorrecta) {
			try {
				System.out.print("ingrese fecha de compra ");
				String f=sc.next();
				 fecha = LocalDate.parse(f);
				fechaIncorrecta = false;
			} catch (Exception e) {
				System.out.println("Error en el formto debe ingresar con formato : 2024-09-28");
				fechaIncorrecta = true;
			}

		}
		PagoTarjeta p = new PagoTarjeta(numero,fecha);
		return p;
	}
	/**
	 * Este método hace la sumatoria de las compras .
	 *
	 */

	public static double totalmontoDeCompra() {
		double suma=0;
		for(int i=0;i< compras.size();i++) {
			Producto c = compras.get(i);
			suma=suma+ c.getPrecioUnitario();
		}
		return suma;
	}
	/**
	 * Este método almacena en un nuevo ArrayList .
	 *
	 */
	public static void agregarAlCarrito(Producto producto) {
		compras.add(producto);
	}
	
	public static Producto buscar(String codigo) {
		for(int i=0; i< productos.size();i++) {
			Producto p = productos.get(i);
			if(p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null;
	}
	
	/**
	 * Este método listo los productos que estan en estock.
	 *
	 */
	public static void listarProductosEnStock() {
		for(int i=0; i <productos.size();i++) {
			Producto p =productos.get(i);
			if(p.isEstado() == true) {
				System.out.println(productos.get(i));
			}
		}
	}
	/**
	 * Este método hace precarga de productos.
	 *
	 */
	public static void  precargaProductos() {
		productos.add(new Producto("0001","Samsung ",800000,origenFabricacion.CHINA,categoria.TELEFONIA,true));
		productos.add(new Producto("0002","Monitor ",450000,origenFabricacion.CHINA,categoria.INFORMATICA,true));
		productos.add(new Producto("0003 ", "Teclado ", 120000,origenFabricacion.CHINA,categoria.INFORMATICA,true));
		productos.add(new Producto("0004","Microfono ",150000, origenFabricacion.BRASIL,categoria.INFORMATICA,true));
		productos.add(new Producto("0005","Microhondas",90000,origenFabricacion.ARGENTINA,categoria.ELECTROHOGAR,true));
		productos.add(new Producto("0006","Calculadora ",50000,origenFabricacion.URUGUAY,categoria.INFORMATICA,false));
		productos.add(new Producto("0007","Mause", 40000,origenFabricacion.CHINA,categoria.INFORMATICA,false));
		productos.add(new Producto("0008","Taladro ",80000,origenFabricacion.BRASIL,categoria.HERRAMIENTAS,true));
		productos.add(new Producto("0009","Martillo ",15000,origenFabricacion.ARGENTINA,categoria.HERRAMIENTAS,true));
		productos.add(new Producto("0010","Amoladora", 200000,origenFabricacion.URUGUAY,categoria.HERRAMIENTAS,true));
		productos.add(new Producto("0011","horno", 250000,origenFabricacion.BRASIL,categoria.ELECTROHOGAR,true));
		productos.add(new Producto("0012","Auriculares ",60000,origenFabricacion.ARGENTINA,categoria.TELEFONIA,true));
		productos.add(new Producto("0013","Memoria telefono",40000,origenFabricacion.URUGUAY,categoria.TELEFONIA,true));
		productos.add(new Producto("0014","heladera ",850000,origenFabricacion.ARGENTINA,categoria.ELECTROHOGAR,true));
		productos.add(new Producto("0015","nnnnnnnn",1000000,origenFabricacion.CHINA,categoria.ELECTROHOGAR,false));
	}
	/**
	 * Este método mustra los productos.
	 *
	 */
	public static void mostarProducto() {
		for(int i=0; i< productos.size();i++ ) {
			System.out.println(productos.get(i));
		}
	}
	
	

}
