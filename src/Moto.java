
public class Moto extends Vehiculo {
	private Persona acompaniante;

	public Moto(Persona nombre) {
		super(nombre);
	}

	@Override
	public void cambiarChofer(Persona p) {
		this.setChofer(p);
	}

	@Override
	public boolean subirPasajero(Persona p) {
		System.out.println(this.getCantPersonas());
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

	@Override
	public String toString() {
		return "Automovil [acompaniante=" + acompaniante + "]";
	}

	public Persona getAcompaniante() {
		return this.acompaniante;
	}

}
