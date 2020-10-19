package ar.edu.unlam.pb2;

public class Ciclismo extends Disciplina{

	public Ciclismo(Persona persona1, Double kmRecorrido, Double tiempoTranscurrido) {
		super(persona1, kmRecorrido, tiempoTranscurrido);
		
	}
	
	@Override
	//Kilometros por HORA
	public Double  Ritmo() {
		Double hora=60.0;
		return this.getkmRecorrido()/(this.getTiempoTranscurrido()/hora);
		
	}
	
	

	
	
}
