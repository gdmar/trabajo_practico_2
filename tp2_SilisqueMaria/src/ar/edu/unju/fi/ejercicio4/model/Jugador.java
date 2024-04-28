package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private Posicion pocicion;
	
	
	
	public double calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period e = Period.between( getFechaNacimiento(),fechaActual);
		double edad = e.getYears();
		return edad;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", pocicion="
				+ pocicion + ", edad : " + calcularEdad()+ "]";
	}
	public Jugador() {
		super();
	}
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, float estatura,
			float peso, Posicion pocicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.pocicion = pocicion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Posicion getPocicion() {
		return pocicion;
	}
	public void setPocicion(Posicion pocicion) {
		this.pocicion = pocicion;
	}
	
	
}
