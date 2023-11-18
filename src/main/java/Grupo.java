import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private DepartamentoVentas departamentoVentas;
	private DepartamentoAdquisiciones departamentoAdquisiciones;
	private DepartamentoProduccion departamentoProduccion;
	private DepartamentoLogistica departamentoLogistica;
	private DepartamentoFinanzas departamentoFinanzas;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public void trabajar() {
		throw new UnsupportedOperationException();
	}
}