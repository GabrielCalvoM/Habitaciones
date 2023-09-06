package habitaciones;

public class Cuarto extends Habitacion {
	private String nombre = "Baño";
	private int television;
	private int cama;
	
	public Cuarto(int ptelevision, int pcama) {
		super(60);
		television = ptelevision; 
		cama = pcama;  
		nombre = nom;
	}
	
	public void tenderCama() {
		System.out.println("Cama tendida");
	}

}
