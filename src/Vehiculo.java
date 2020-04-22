
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

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public int getCantPersonas() {
		return this.cantPersonas;
	}

	@Override
	public String toString() {
		return "Soy un " + getType() + " tengo de chofer a " + this.getChofer() + " y recorri " + this.kmRecorridos
				+ " km y tengo " + (this.cantPersonas - 1) + " pasajeros";
	}

	public abstract String getType();

	public abstract boolean cambiarChofer(Persona p);

	public abstract boolean subirPasajero(Persona p);

	public abstract boolean vehiculoConEspacio();
	
	public abstract void bajarPasajero();

}
