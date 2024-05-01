package ar.edu.unju.fi.ejercicio5.model;


public class Producto {
	private String codigo;
	private String descripcion;
	private float precioUnitario;
	private origenFabricacion origen;
	private categoria cat;
	private boolean estado;
	
	public enum origenFabricacion{
		ARGENTINA,
		CHINA,
		BRASIL,
		URUGUAY
	}
	public enum categoria{
		TELEFONIA,INFORMATICA,ELECTROHOGAR,HERRAMIENTAS
	}
	
	public Producto() {
		super();
	}
	public Producto(String codigo, String descripcion, float precioUnitario, origenFabricacion origen, categoria cat,
			boolean estado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origen = origen;
		this.cat = cat;
		this.estado = estado;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public origenFabricacion getOrigen() {
		return origen;
	}
	public void setOrigen(origenFabricacion origen) {
		this.origen = origen;
	}
	public categoria getCat() {
		return cat;
	}
	public void setCat(categoria cat) {
		this.cat = cat;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", origen=" + origen + ", cat=" + cat + ", estado=" + estado + "]";
	}
	

}
