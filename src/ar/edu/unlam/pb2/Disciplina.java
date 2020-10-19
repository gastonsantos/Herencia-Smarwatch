package ar.edu.unlam.pb2;

public abstract class Disciplina {
	
	Persona persona1;
	
	private Double kmRecorrido;
	private Double tiempoTranscurrido;
	//Firma de Metodo Abstracto
	public abstract Double Ritmo();
	
	public Double getkmRecorrido() {
		return kmRecorrido;
	}
	public void setkmRecorrido() {
		this.kmRecorrido = persona1.getPasosDiarios()/1500;
	}
	public Double getTiempoTranscurrido() {
		return tiempoTranscurrido;
	}
	public void setTiempoTranscurrido(Double tiempoTranscurrido) {
		this.tiempoTranscurrido = tiempoTranscurrido;
	}

	
	
	
	public Disciplina(Persona persona1, Double kmRecorrido, Double tiempoTranscurrido) {
		super();
		this.persona1 = persona1;
		this.kmRecorrido = kmRecorrido;
		this.tiempoTranscurrido = tiempoTranscurrido;
	}
	
	
}
