package habitaciones;

public interface IRoom {
	void abrirPuerta(Puerta objeto);
	void cerrarPuerta(Puerta objeto);
	void abrirVentana(Ventana objeto);
	void cerrarVentana(Ventana objeto);
	void encenderLuz(Luz objeto);
	void apagarLuz(Luz objeto);
}
