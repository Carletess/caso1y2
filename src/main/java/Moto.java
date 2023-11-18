public class Moto {
	private String marca;
	private String modelo;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void avanzar() {
		throw new UnsupportedOperationException();
	}
}