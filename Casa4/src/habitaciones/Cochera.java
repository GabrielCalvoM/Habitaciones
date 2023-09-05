package habitaciones;

public class Cochera extends Habitacion {
	Luz bombillo;
	Puerta puerta;
	Ventana ventana;
	private int carro; 
	 
	 public Cochera(int pcarro,  Luz pluz, Puerta ppuerta, Ventana pventana) {
		 luz = pluz;
		 puerta = ppuerta;
		 ventana = pventana;
		 carro = pcarro;
	 }
	public bool detectarCarro(); 

}
