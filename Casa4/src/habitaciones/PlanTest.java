package habitaciones;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;

public class PlanTest extends Thread {
	
	private Cuarto cuarto = new Cuarto(1, 1, "Cuarto");
	private Baño baño = new Baño("Baño");
	private Sala sala = new Sala("Sala");
	private Cochera cochera = new Cochera(1, "Cochera");
	private Cocina cocina = new Cocina(2, 1, "Cocina");
	private Comedor comedor = new Comedor(1, 6, "Comedor");
	
	private ArrayList<Test> listatest = new ArrayList<Test>();
	private TaskRoom manager = new TaskRoom();
	private Date fecha = new Date();
	private Calendar contador = GregorianCalendar.getInstance();
	private int hora;
	private Boolean cambio;
		
	public void loadTest() {
		//2:00
		listatest.add(new Test(2, manager, sala, Evento.ensuciar));
				
		//6:00
		listatest.add(new Test(6, manager, cuarto, Interaccion.abrirPuerta));
		listatest.add(new Test(6, manager, baño, Interaccion.abrirPuerta));
		listatest.add(new Test(6, manager, sala, Evento.ensuciar));
		
		//7:00
		listatest.add(new Test(7, manager, sala, Evento.ensuciar));
		listatest.add(new Test(7, manager, sala, Evento.ensuciar));
		
		//9:00
		listatest.add(new Test(9, manager, sala, Evento.ensuciar));
		
		//12:00
		listatest.add(new Test(12, manager, sala, Evento.ensuciar));
		listatest.add(new Test(12, manager, sala, Evento.ensuciar));
		
		//14:00
		listatest.add(new Test(14, manager, sala, Evento.ensuciar));
		
		//16:00
		listatest.add(new Test(16, manager, sala, Evento.ensuciar));
		listatest.add(new Test(16, manager, sala, Evento.ensuciar));
		listatest.add(new Test(16, manager, sala, Evento.ensuciar));
		
		//20:00
		listatest.add(new Test(20, manager, sala, Evento.ensuciar));
		listatest.add(new Test(20, manager, sala, Evento.ensuciar));
		
	}
	
	public void setFecha() {
		contador.setTime(fecha);
		contador.set(contador.SECOND, 0);
		hora = contador.get(Calendar.HOUR_OF_DAY);
		cambio = false;
	}
	
	public void run() {
		for (Test test : listatest) {
			if (test.getHora() == hora) {
				if (test.getInteraccion() == null) {
					test.getAccion().crearEvento(test.getHabitacion(), test.getEvento());
				}
				else {
					test.getAccion().crearEvento(test.getHabitacion(), test.getInteraccion());
				}
			}
		}
		
		int sec = contador.get(contador.SECOND);
		
		if ((sec % 5 == 4) && (cambio == false)) {
			hora += 1;
			cambio = true;
		}
		
		if (sec % 5 == 2) {
			cambio = false;
		}
	}
	
}
