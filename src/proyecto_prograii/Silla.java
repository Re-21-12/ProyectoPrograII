package proyecto_prograii;

import java.util.*;
public class Silla extends Producto{
//asi como en materiales tambien usuaremos string para posteriormente convertirlo
	// private Material material;
	// llevara un orden, para ver si se desea comprar materiales para la silla o
	// vender la silla a precio de venta
	// private String orden;
	// private String tipoDeSilla;
	// sera de tipo Int
	// private String cantidadDeSillas;
	// double
	//= "174.91"
	/*
	 * si una persona en un dia hace mano de obra Q.3,323.60 + Q250 = 119.12
	 * operador de maquina diario 357.36 Q por 3 dias pero en ese dia hace 10 sillas
	 * 
	 * precion de venta-> costo de la silla *
	 * 
	 * la silla se va a armar despues de ver el inventairo clase facturacion
	 * 
	 * mano de obra / total de sillas + iva = facturacion Por ejemplo: 0.25kg ->
	 * Q27,06 = (cantidad_pegamento en kg * precio)/0.25kg -> 12.96 0.1250 * 27.00 =
	 * 3.3825Q 0.9463kg -> Q75,00 = (cantidad_barniz en kg * precio)/0.9463kg = 39
	 * Quetzales por 1/4 de barniz 3 pedazos de madera -> Q100 necesitamos 10 clavos
	 * de una bolsa de 40 de 0.454clavos -> 2.25 Q 2 lijas 10Q
	 */
	// el precio de venta es : costo despues de cortar materiales + mano de obra =
	// total *
	private Double precio_venta ; //"195.90" <- precio de venta 
	private ArrayList<Material> materiales;
	public Double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public ArrayList<Material> getMateriales() {
		return materiales;
	}
	public void setMateriales(ArrayList<Material> materiales) {
		this.materiales = materiales;
	}
	/**
	 * @param id
	 * @param nombre
	 * @param costo
	 * @param precio_venta
	 * @param materiales
	 */
	public Silla(String id, String nombre, Double costo, Double precio_venta, ArrayList<Material> materiales) {
		super(id, nombre, costo);
		this.precio_venta = precio_venta;
		this.materiales = materiales;
	}
	@Override
	public String toString() {
		return "Silla [precio_venta=" + precio_venta + ", materiales=" + materiales + ", Id=" + getId()
				+ ", Nombre_Producto=" + getNombre() + ", Costo=" + getCosto();
	}


}
