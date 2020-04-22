
public class Main {

	public static void main(String[] args) {
		// moto();
		// auto();
		// colectivo();

	}

	public static void moto() {
		Moto a = new Moto(new Persona("Juan"));
		a.subirPasajero(new Persona("Pepe"));
		a.subirPasajero(new Persona("Leandro"));
		a.subirPasajero(new Persona("Miriam"));
		a.setKmRecorridos(300);
		System.out.println(a);
	}

	public static void auto() {
		Automovil a = new Automovil(new Persona("Juan"));
		a.subirPasajero(new Persona("Pepe"));
		a.subirPasajero(new Persona("Leandro"));
		a.subirPasajero(new Persona("Miriam"));
		a.setKmRecorridos(300);
		System.out.println(a);
	}

	public static void colectivo() {
		Colectivo c = new Colectivo(new Persona("Juan"));
		do {

		} while (c.subirPasajero(new Persona("a")));
		c.setKmRecorridos(100);
		System.out.println(c);
	}
}
