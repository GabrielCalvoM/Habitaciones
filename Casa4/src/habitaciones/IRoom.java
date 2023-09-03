package habitaciones;

public interface IRoom {
	void interactuarObjeto(Puerta objeto, Interaccion accion);
	void interactuarObjeto(Ventana objeto, Interaccion accion);
	void interactuarObjeto(Luz objeto, Interaccion accion);
	void crearEvento(Evento ocurrencia);
}
