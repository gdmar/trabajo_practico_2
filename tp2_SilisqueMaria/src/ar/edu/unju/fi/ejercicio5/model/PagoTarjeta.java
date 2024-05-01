package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoTarjeta implements Pago {
	
	private String numeroTarjeta;
	private LocalDate fechaPago;
	private double montoPagado;
	
	

	public PagoTarjeta(String numeroTarjeta, LocalDate fechaPago) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
	}

	@Override
	public String toString() {
		return "PagoTarjeta [numeroTarjeta=" + numeroTarjeta + ", fechaPago=" + fechaPago + ", montoPagado="
				+ montoPagado + "]";
	}

	public PagoTarjeta() {
		super();
	}

	public PagoTarjeta(String numeroTarjeta, LocalDate fechaPago, double montoPagado) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
	}

	@Override
	public void realizarPago(double monto) {
		double recarga=0.15;
		 double totalrecarga= recarga *monto ;
		 montoPagado=monto+totalrecarga;
	
	}

	@Override
	public void imprimirRecibo() {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("----------------PAGO CON TARJETA -----------------");
		System.out.println("Numero de tarjeta: "+numeroTarjeta);
		System.out.println("Fecha de pago: "+ fechaPago.format(formato1));
		System.out.println("Monto de pago: "+montoPagado);
		
	}

}
