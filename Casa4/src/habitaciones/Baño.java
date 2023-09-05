package habitaciones;

public class Baño  extends Habitacion {
	private Boolean innodoro = false;
	private Boolean ducha = false;
	private Boolean lavaManos = false;
	
	public Baño(Boolean pinnodoro, Boolean pducha, Boolean plavaManos) {
		super(40);
		innodoro = pinnodoro;    
		ducha = pducha;  
		lavaManos = plavaManos; 
	}
	
	public void abrirLlave(Boolean objeto) {
		objeto = true;
	}
	
	public void cerrarLlave(Boolean objeto) {
		objeto = false;
	}
	
}
