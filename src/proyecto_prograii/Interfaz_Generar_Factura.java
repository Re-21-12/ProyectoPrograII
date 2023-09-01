package proyecto_prograii;

import java.time.*;
public interface Interfaz_Generar_Factura {
	public abstract Factura Generar_factura(String id, LocalDateTime fecha,Double venta, String Nombre_institucion,Producto producto);
}
