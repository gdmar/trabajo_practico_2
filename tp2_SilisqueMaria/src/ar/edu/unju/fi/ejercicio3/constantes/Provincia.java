package ar.edu.unju.fi.ejercicio3.constantes;

public enum Provincia {
	JUJUY(811611,53219),
	SALTA(1441351,155488),
	TUCUMAN(1593000,91),
	CATAMARCA(429562,102602),
	LARIOJA(362605,89680),
	SANTIAGODELESTERO(1060906,136351);
	
	private double cantidadPoblacion;
	private double superficie;
	
	public double densidad() {
		double den = this.cantidadPoblacion/ this.superficie;
		return den;
	}
	
	public void mostrar() {
		System.out.println("Nombre : " + this.name() );
		System.out.println("cantidad poblacional : " + this.cantidadPoblacion);
		System.out.println("superficie : " + this.superficie);
		System.out.println("densidad : "+ this.densidad());
	}
	private Provincia() {
	}
	private Provincia(double cantidadPoblacion, double superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}
	
	public double getCantidadPoblacion() {
		return cantidadPoblacion;
	}
	public void setCantidadPoblacion(double cantidadPoblacion) {
		this.cantidadPoblacion = cantidadPoblacion;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	

}
