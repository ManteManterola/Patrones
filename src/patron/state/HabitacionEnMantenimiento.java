package patron.state;

public class HabitacionEnMantenimiento implements HabitacionEstado{

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return new HabitacionOcupadaDisponible();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitacion se empieza a limpiar");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

}
