package composicion;

public class Case {
	private String modelo;
	private String fabricante;
	private String fuenteDepoder;
	private Dimensiones dimensiones;
	
	public Case(String modelo,String fabricante,String fuenteDePoder,Dimensiones dimensiones) {
		   this.modelo=modelo;
		   this.fabricante=fabricante;
		   this.fuenteDepoder=fuenteDePoder;
		   this.dimensiones=dimensiones;
		   
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFuenteDepoder() {
		return fuenteDepoder;
	}

	public void setFuenteDepoder(String fuenteDepoder) {
		this.fuenteDepoder = fuenteDepoder;
	}

	public Dimensiones getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(Dimensiones dimensiones) {
		this.dimensiones = dimensiones;
	}
}
