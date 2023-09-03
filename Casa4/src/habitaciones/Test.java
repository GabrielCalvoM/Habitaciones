package habitaciones;

import java.util.Date;

public class Test {
	
	private Date hora;
	private IRoom accion;
	private Evento evento;
	private Interaccion objeto;
	
	public Test(Date phora, IRoom paccion, Evento pevento) {
		this.hora = phora;
		this.accion = paccion;
		this.evento = pevento;
	}
	
	public Test(Date phora, IRoom paccion, Interaccion pobjeto) {
		this.hora = phora;
		this.accion = paccion;
		this.objeto = pobjeto;
	}
	
	public Date gethora() {
		return hora;
	}
	
	public IRoom getaccion() {
		return accion;
	}
	
	public Evento getevento() {
		return evento;
	}
	
	public Interaccion getinteraccion() {
		return objeto;
	}
	
}
