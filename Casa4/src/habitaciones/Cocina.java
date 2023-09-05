package habitaciones;

public class Cocina extends Habitacion {
	Luz bombillo;
	Puerta puerta;
	Ventana ventana;
	private int plantilla;
	private int refrigerador;
	
	public Cocina(int pplantilla, int prefrigerador, Luz pluz, Puerta ppuerta, Ventana pventana) { 
		luz = pluz;
		puerta = ppuerta;
		ventana = pventana;
		plantilla = pplantilla;        
		refrigerador = prefrigerador;        
	} 

 
}
