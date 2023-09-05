package habitaciones;

public class Cuarto extends Habitacion {
	Luz bombillo;
	Puerta puerta;
	Ventana ventana; 
	private int television;
	private int cama;
	
	public Cuarto(int ptelevision, int pcama, Luz pluz, Puerta ppuerta, Ventana pventana) {
		luz = pluz;
		puerta = ppuerta;
		ventana = pventana;
		television = ptelevision; 
		cama = pcama;  
	}
	
	public void tenderCama() {
		System.out.println("Cama tendida");
	}

}
