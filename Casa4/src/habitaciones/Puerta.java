package habitaciones;

public class Puerta {
	
	private state estado;
	private Habitacion h1;
	
	public Puerta(Habitacion habitacion1) {
		this.estado = state.cerrado;
		this.h1 = habitacion1;
	}
	
	public void cambiarEstado(state estado) {
		if (this.estado != estado) {
			this.estado = estado;
		}
	}
	
	public state compartirEstado() {
		return this.estado;
	}

}
