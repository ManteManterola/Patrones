package patron.state;

public class HabitacionOcupadaDisponible implements HabitacionEstado{

	
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this ;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitacion se empieza a limpiar");
		return new HabitacionEnMantenimiento();
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}
}
