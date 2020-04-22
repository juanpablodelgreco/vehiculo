
public abstract class Vehiculo {

	private Persona chofer;
	private double kmRecorridos;
	private int cantPersonas;

	public Vehiculo(Persona nombre) {
		this.chofer = nombre;
		this.kmRecorridos = 0;
		this.cantPersonas = 1;
	}

	public Persona getChofer() {
		return chofer;
	}

	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public int getCantPersonas() {
		return this.cantPersonas;
	}

	public abstract void cambiarChofer(Persona p);

	public abstract boolean subirPasajero(Persona p);

	public abstract boolean vehiculoConEspacio();
}
