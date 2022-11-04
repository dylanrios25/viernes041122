package composicion;

public class Dimensiones {
  private int Anchura;
  private int altura;
  private int profundidad;
public Dimensiones(int anchura, int altura, int profundidad) {
	super();
	Anchura = anchura;
	this.altura = altura;
	this.profundidad = profundidad;
}
public int getAnchura() {
	return Anchura;
}
public void setAnchura(int anchura) {
	Anchura = anchura;
}
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public int getProfundidad() {
	return profundidad;
}
public void setProfundidad(int profundidad) {
	this.profundidad = profundidad;
}
  
}
