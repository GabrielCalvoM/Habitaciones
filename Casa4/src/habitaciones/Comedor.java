package habitaciones;

public class Comedor extends Habitacion {
	private int mesa;
	private int silla;
	
	public Comedor(int cmesa, int csilla) {
		super(55);
		mesa = cmesa;
		silla = csilla; 
	}

}