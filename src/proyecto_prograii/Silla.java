package proyecto_prograii;

public class Silla {
//asi como en materiales tambien usuaremos string para posteriormente convertirlo
	private Material material;
	// llevara un orden, para ver si se desea comprar materiales para la silla o
	// vender la silla a precio de venta
	private String orden;
	private String tipoDeSilla;
	// sera de tipo Int
	private String cantidadDeSillas;
	//double
	private String costo;



	/**
	 * @param material
	 * @param orden
	 * @param tipoDeSilla
	 * @param cantidadDeSillas
	 * @param costo
	 */
	public Silla(Material material, String orden, String tipoDeSilla, String cantidadDeSillas, String costo) {
		super();
		this.material = material;
		this.orden = orden;
		this.tipoDeSilla = tipoDeSilla;
		this.cantidadDeSillas = cantidadDeSillas;
		this.costo = costo;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getTipoDeSilla() {
		return tipoDeSilla;
	}

	public void setTipoDeSilla(String tipoDeSilla) {
		this.tipoDeSilla = tipoDeSilla;
	}

	public String getCantidadDeSillas() {
		return cantidadDeSillas;
	}

	public void setCantidadDeSillas(String cantidadDeSillas) {
		this.cantidadDeSillas = cantidadDeSillas;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Silla [material=" + material + ", orden=" + orden + ", tipoDeSilla=" + tipoDeSilla
				+ ", cantidadDeSillas=" + cantidadDeSillas + ", costo=" + costo + "]";
	}



}
