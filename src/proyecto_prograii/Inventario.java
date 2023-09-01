package proyecto_prograii;
import java.util.*;
public class Inventario {
private ArrayList<Silla> sillas;
//almacenara los costos y ganancias en total y sera del tiipo double
/**
 * @param sillas
 * @param dinero
 */
public ArrayList<Silla> getSillas() {
	return sillas;
}
public void setSillas(ArrayList<Silla> sillas) {
	this.sillas = sillas;
}
/**
 * @param sillas
 * @param materiales
 */
public Inventario(ArrayList<Silla> sillas) {
	super();
	this.sillas = sillas;
}
@Override
public String toString() {
	return "Inventario [sillas=" + sillas + "]";
}

}
