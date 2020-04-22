
public class Colectivo extends Vehiculo {
	private static final int MAX_PASAJEROS = 30;
	private Persona[] pasajeros;

	public Colectivo(Persona nombre) {
		super(nombre);
		this.pasajeros = new Persona[MAX_PASAJEROS];
	}

	@Override
	public boolean cambiarChofer(Persona p) {
		if (this.getCantPersonas() == 1) {
			this.setChofer(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean subirPasajero(Persona p) {
		if (this.vehiculoConEspacio()) {
			this.pasajeros[this.getCantPersonas() - 1] = p;
			this.setCantPersonas(this.getCantPersonas() + 1);
			return true;
		}

		return false;
	}

	@Override
	public boolean vehiculoConEspacio() {
		if (this.getCantPersonas() <= MAX_PASAJEROS)
			return true;
		return false;
	}

	@Override
	public String getType() {
		return "Colectivo";
	}

}
