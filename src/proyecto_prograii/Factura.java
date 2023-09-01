package proyecto_prograii;

import java.time.*;
public class Factura {
private String id;
private LocalDateTime fecha;
private Double venta;
private String nombre_institucion;
private Producto producto;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public LocalDateTime getFecha() {
	return fecha;
}
public void setFecha(LocalDateTime fecha) {
	this.fecha = fecha;
}
public Double getVenta() {
	return venta;
}
public void setVenta(Double venta) {
	this.venta = venta;
}
public String getNombre_institucion() {
	return nombre_institucion;
}
public void setNombre_institucion(String nombre_institucion) {
	this.nombre_institucion = nombre_institucion;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
/**
 * @param id
 * @param fecha
 * @param venta
 * @param nombre_institucion
 * @param producto
 */
public Factura(String id, LocalDateTime fecha, Double venta, String nombre_institucion, Producto producto) {
	super();
	this.id = id;
	this.fecha = fecha;
	this.venta = venta;
	this.nombre_institucion = nombre_institucion;
	this.producto = producto;
}
@Override
public String toString() {
	return "Factura [id=" + id + ", fecha=" + fecha + ", venta=" + venta + ", nombre_institucion=" + nombre_institucion
			+ ", producto=" + producto + "]";
}

}
