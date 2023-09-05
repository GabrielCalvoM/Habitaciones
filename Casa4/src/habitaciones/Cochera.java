package habitaciones;

public class Cochera extends Habitacion {
	private int carro; 
	 
	 public Cochera(int pcarro) {
		 super(80);
		 carro = pcarro;
	 }
	public Boolean detectarCarro() {
		if (this.carro > 0) {
			return true;
		}
		
		return false;
	}

}
