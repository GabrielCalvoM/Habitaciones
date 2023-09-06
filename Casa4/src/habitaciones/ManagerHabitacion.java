package habitaciones;

public class ManagerHabitacion {
	
	public void abrirPuerta(Habitacion habitacion) {
		habitacion.usarPuerta(state.abierto);
		Syste
	}

	public void cerrarPuerta(Habitacion habitacion) {
		habitacion.usarPuerta(state.cerrado);
	}

	public void abrirVentana(Habitacion habitacion) {
		habitacion.usarVentana(state.abierto);
	}

	public void cerrarVentana(Habitacion habitacion) {
		habitacion.usarVentana(state.cerrado);
	}

	public void iluminar(Habitacion habitacion) {
		habitacion.iluminar(iluminacion.encendido);
	}

	public void oscurecer(Habitacion habitacion) {
		habitacion.iluminar(iluminacion.apagado);
	}
	
	public void ensuciar(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.suciedad);
	}
	
	public void taquear(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.desague);
	}
	
	public void inundar(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.inundacion);
	}
	
	public void cortarLuz(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.luz);
	}
	
	public void cortarAgua(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.agua);
	}
	
	public void contramedidas(Habitacion habitacion) {
		habitacion.solucionProblemas();
	}
	
	public void activarInnodoro(Baño habitacion) {
		habitacion.abrirLlave(Llaves.innodoro);
	}
	
	public void activarDucha(Baño habitacion) {
		habitacion.abrirLlave(Llaves.ducha);
	}
	
	public void activarLavamanos(Baño habitacion) {
		habitacion.abrirLlave(Llaves.lavamanos);
	}
	
	public void desactivarInnodoro(Baño habitacion) {
		habitacion.cerrarLlave(Llaves.innodoro);
	}
	
	public void desactivarDucha(Baño habitacion) {
		habitacion.cerrarLlave(Llaves.ducha);
	}
	
	public void desactivarLavamanos(Baño habitacion) {
		habitacion.cerrarLlave(Llaves.lavamanos);
	}
	
}
