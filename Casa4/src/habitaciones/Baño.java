package habitaciones;

public class Bath  extends Habitacion {
	Luz bombillo;
	Puerta puerta;
	Ventana ventana; 
	private int innodoro;
	private int ducha;
	private int lavaManos;
	
	public Bath(int pinnodoro, int pducha, int plavaManos, Luz pluz, Puerta ppuerta, Ventana pventana) {
		 luz = pluz;
		 puerta = ppuerta;
		 ventana = pventana;
		 innodoro = pinnodoro;    
		 ducha = pducha;  
		 lavaManos = plavaManos; 
	}
	
	
}
