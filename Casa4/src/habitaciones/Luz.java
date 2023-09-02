package habitaciones;

public class Luz {
	
	private iluminacion estado;
	
	public Luz() {
		this.estado = iluminacion.apagado;
	}
	
	public void cambiarEstado(iluminacion estado) {
		if (this.estado != estado) {
			this.estado = estado;
		}
	}
	
}
