package habitaciones;

public class Cuarto extends Habitacion {
	private int television;
	private int cama;
	
	public Cuarto(int ptelevision, int pcama) {
		super(60);
		television = ptelevision; 
		cama = pcama;  
	}
	
	public void tenderCama() {
		System.out.println("Cama tendida");
	}

}
