package habitaciones;

public class Baño extends Habitacion {
	private String nombre = "Baño";
	private Boolean innodoro = false;
	private Boolean ducha = false;
	private Boolean lavaManos = false;

	public Baño(String nom) {
		super(40); 
		nombre = nom;
	}
	
	public void abrirLlave(Llaves llave) {
		if (llave == Llaves.ducha) {
			this.ducha = true;
		}
		
		if (llave == Llaves.innodoro) {
			this.innodoro = true;
		}
		
		if (llave == Llaves.lavamanos) {
			this.lavaManos = true;
		}
	}
	
	public void cerrarLlave(Llaves llave) {
		if (llave == Llaves.ducha) {
			this.ducha = false;
		}
		
		if (llave == Llaves.innodoro) {
			this.innodoro = false;
		}
		
		if (llave == Llaves.lavamanos) {
			this.lavaManos = false;
		}
	}
	
}
