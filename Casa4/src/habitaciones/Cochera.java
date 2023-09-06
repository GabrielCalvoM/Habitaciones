package habitaciones;

public class Cochera extends Habitacion {
	private String nombre = "Cochera";
	private int carro; 
	 
	 public Cochera(int pcarro, String nom) {
		 super(80);
		 carro = pcarro;
		 nombre = nom
	 }
	public Boolean detectarCarro() {
		if (this.carro > 0) {
			return true;
		}
		
		return false;
	}

}
