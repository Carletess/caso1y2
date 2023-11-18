import java.util.ArrayList;

public class EmpresaNaviera {
	private String nombre;
	private ArrayList<Departamento> departamento = new ArrayList<Departamento>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}