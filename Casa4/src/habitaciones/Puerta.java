package habitaciones;

public class Puerta {
	
	private state estado;
	private Habitacion h1;
	private Puerta h2;
	
	public Puerta(Habitacion habitacion1) {
		this.estado = state.cerrado;
		this.h1 = habitacion1;
	}
	
	public void enlace(Puerta habitacion2) {
		if (this.h2 == null) {
			if (habitacion2.h2 == null) {
				this.h2 = habitacion2;
				habitacion2.h2 = this;
			}
		}
		
	}
	
	public void cambiarEstado(state estado) {
		if (this.estado != estado) {
			this.estado = estado;
			this.h2.estado = estado;
		}
	}

}