
public class Main {
	
	public static void main(String[] args) {
		//Automovil a = new Automovil(new Persona("Juan"));
		Moto a = new Moto(new Persona("Juan"));
		System.out.println(a.getChofer());
		a.subirPasajero(new Persona("Pepe"));
		System.out.println(a.getAcompaniante());
		a.subirPasajero(new Persona("Leandro"));
		System.out.println(a.getAcompaniante());
		a.subirPasajero(new Persona("Miriam"));
		System.out.println(a.getAcompaniante());
	}
}
