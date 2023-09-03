package habitaciones;

public class Ventana {
	
	private state estado = state.cerrado;
	
	public Ventana() {
		
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
