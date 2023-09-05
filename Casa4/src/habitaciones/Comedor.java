package habitaciones;

public class Comedor extends Habitacion {
	Luz bombillo;
	Puerta puerta;
	Ventana ventana;
	private int mesa;
	private int silla;
	
	public Comedor(int cmesa, int csilla,  Luz pluz, Puerta ppuerta, Ventana pventana) {
		luz = pluz;
		puerta = ppuerta;
		ventana = pventana;  
		mesa = cmesa;
		silla = csilla; 
	}

}