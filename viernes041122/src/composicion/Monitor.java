package composicion;

public class Monitor {

	private String modelo;
	private String fabricante;
	private int tamanio;
	private Resolucion resolucionNativa;

	public monitor(String modelo,String fabricante,int tamanio,Resolucion resolucionNativa) {
		this.modelo=modelo;
		this.fabricante= fabricante;
	    this.tamanio=tamanio;
	    this.resolucionNativa=resolucionNativa;
	
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

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Resolucion getResolucionNativa() {
		return resolucionNativa;
	}

	public void setResolucionNativa(Resolucion resolucionNativa) {
		this.resolucionNativa = resolucionNativa;
	}

	
}