package ar.edu.unlam.pb2;

public class Persona {
	private String nombre;
	private Integer edad;
	private Double peso;
	private Double altura;
	private Double pasosDiarios;
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPasosDiarios() {
		return pasosDiarios;
	}
	public void setPasosDiarios(Double pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}
	public Persona(String nombre, Integer edad, Double peso, Double altura, Double pasosDiarios) {
	
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pasosDiarios = pasosDiarios;
	}
	

}
