
public class Automovil extends Vehiculo {
	private Persona acompaniante;

	public Automovil(Persona nombre) {
		super(nombre);
	}

	@Override
	public boolean cambiarChofer(Persona p) {
		this.setChofer(p);
		return true;
	}

	@Override
	public boolean subirPasajero(Persona p) {
		if (this.vehiculoConEspacio()) {
			this.acompaniante = p;
			this.setCantPersonas(this.getCantPersonas() + 1);
			return true;
		}
		return false;
	}

	@Override
	public boolean vehiculoConEspacio() {
		if (this.getCantPersonas() == 2)
			return false;
		return true;
	}

	public Persona getAcompaniante() {
		return this.acompaniante;
	}

	@Override
	public String getType() {
		return "Automovil";
	}
	
	@Override
	public void bajarPasajero() {
		this.acompaniante = null;
		this.setCantPersonas(1);
	}
	
}
