package ar.edu.unlam.pb2;

public class Carrera extends Disciplina {




	public Carrera(Double kmRecorrido, Double tiempoTranscurrido, Persona persona1) {
		super(persona1, kmRecorrido, tiempoTranscurrido);
			
		}
	
		@Override
		//Minutos que se demoran en completar un kilometro
		public Double Ritmo() {
			Double metrosRecorrido = this.getkmRecorrido()*1000;
			Double metrosXMin= metrosRecorrido/this.getTiempoTranscurrido();
			Double minXKilometro = metrosXMin/1000;
			return 	minXKilometro;
		}
		public Double KiloCaloriasQuemadas() {
			
			return persona1.getPeso()*this.getkmRecorrido();
		}
		
		public Double PesoPerdido() {
			Double pesoPerdido= 0.0;
			pesoPerdido = KiloCaloriasQuemadas()/7000;
			persona1.setPeso(persona1.getPeso()-pesoPerdido);
			
			return  pesoPerdido;
			
		}
		
		
		
	}

	

