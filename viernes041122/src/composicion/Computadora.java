package composicion;

public class Computadora {
  private Case elCase;
  private Monitor monitor;
  private TarjetaMadre tarjetaMadre;
public Computadora(Case elCase, Monitor monitor, TarjetaMadre tarjetaMadre) {
	super();
	this.elCase = elCase;
	this.monitor = monitor;
	this.tarjetaMadre = tarjetaMadre;
}
public Case getElCase() {
	return elCase;
}
public void setElCase(Case elCase) {
	this.elCase = elCase;
}
public Monitor getMonitor() {
	return monitor;
}
public void setMonitor(Monitor monitor) {
	this.monitor = monitor;
}
public TarjetaMadre getTarjetaMadre() {
	return tarjetaMadre;
}
public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
	this.tarjetaMadre = tarjetaMadre;
}
  
}
