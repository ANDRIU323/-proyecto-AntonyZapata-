package proyectoAntonyZapata;

public class AntonyZapataCoche {
	public String marca;
	public String combustible;
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getCoche() {
		return coche;
	}

	public void setCoche(String coche) {
		this.coche = coche;
	}

	public String  coche;
	
	public AntonyZapataCoche(String marca, String combustible, String  coche) {
		super();
		this.marca= marca;
		this.combustible= combustible;
		this.coche= coche;
}
}