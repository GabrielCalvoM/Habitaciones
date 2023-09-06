package habitaciones;

public class Comedor extends Habitacion {
	private String nombre = "Baño";
	private int mesa;
	private int silla;
	
	public Comedor(int cmesa, int csilla, String nom) {
		super(55);
		mesa = cmesa;
		silla = csilla; 
		nombre = nom;
	}

}