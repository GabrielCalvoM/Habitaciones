package habitaciones;

public class ManagerHabitacion {
	
	public void enlazarHabitaciones(Habitacion habitacion1, Habitacion habitacion2) {
		habitacion1.enlazar(habitacion2);
	}
	
	public void abrirPuerta(Habitacion habitacion, Puerta objeto) {
		habitacion.usarPuerta(objeto, state.abierto);
	}

	public void cerrarPuerta(Habitacion habitacion, Puerta objeto) {
		habitacion.usarPuerta(objeto, state.cerrado);
	}

	public void abrirVentana(Habitacion habitacion, Ventana objeto) {
		habitacion.usarVentana(objeto, state.abierto);
	}

	public void cerrarVentana(Habitacion habitacion, Ventana objeto) {
		habitacion.usarVentana(objeto, state.cerrado);
	}

	public void iluminar(Habitacion habitacion, Luz objeto) {
		habitacion.iluminar(objeto, iluminacion.encendido);
	}

	public void oscurecer(Habitacion habitacion, Luz objeto) {
		habitacion.iluminar(objeto, iluminacion.apagado);
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
	
}
