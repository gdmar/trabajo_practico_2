package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago {
	
	private double montoPagado;
	private LocalDate fechaDePago;
	
	
	

	public PagoEfectivo(LocalDate fechaDePago) {
		super();
		this.fechaDePago = fechaDePago;
	}

	public PagoEfectivo() {
		super();
	}

	public PagoEfectivo(double montoPagado, LocalDate fechaDePago) {
		super();
		this.montoPagado = montoPagado;
		this.fechaDePago = fechaDePago;
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}

	public LocalDate getFechaDePago() {
		return fechaDePago;
	}

	public void setFechaDePago(LocalDate fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	@Override
	public void realizarPago(double monto) {
		double descuento=0.10;
		double totaldescuento=descuento *monto;
		montoPagado=monto-totaldescuento;
		
	}

	@Override
	public void imprimirRecibo() {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("---------------- PAGO EN EFECTIVO -----------------");
		System.out.println("Fecha de pago: "+fechaDePago.format(formato1));
		System.out.println("Monto de pago: "+montoPagado);
		
	}
	

}
