import java.util.ArrayList;
public class Persona {
	private String nombre;
	private ArrayList<Persona> amigos;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Persona> getAmigos() {
		return this.amigos;
	}

	public void setAmigos(ArrayList<Persona> amigos) {
		throw new UnsupportedOperationException();
	}
}