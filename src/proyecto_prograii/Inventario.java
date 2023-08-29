package proyecto_prograii;
import java.util.*;
public class Inventario {
private ArrayList<Silla> sillas;
//almacenara los costos y ganancias en total y sera del tiipo double
private Double dinero;
/**
 * @param sillas
 * @param dinero
 */
public Inventario(ArrayList<Silla> sillas, Double  dinero) {
	super();
	this.sillas = sillas;
	this.dinero = dinero;
}
public ArrayList<Silla> getSillas() {
	return sillas;
}
public void setSillas(ArrayList<Silla> sillas) {
	this.sillas = sillas;
}
public Double  getDinero() {
	return dinero;
}
public void setDinero(Double  dinero) {
	this.dinero = dinero;
}
@Override
public String toString() {
	return "Inventario [sillas=" + sillas + ", dinero=" + dinero + "]";
}

}
