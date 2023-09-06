package habitaciones;

public class Cocina extends Habitacion {
	private String nombre = "Baño";
	private int plantilla;
	private int refrigerador;
	
	public Cocina(int pplantilla, int prefrigerador, String nom) {
		super(65);
		plantilla = pplantilla;        
		refrigerador = prefrigerador;
		nombre = nom;
	} 

 
}
