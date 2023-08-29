package proyecto_prograii;

public interface Interfaz_Fabrica_de_Sillas {
public abstract void cargarSillas(Inventario inventario);
public abstract void revisarInventario();
public abstract void realizarOrdenes(String orden);
public abstract void corteDeMateriales(Inventario inventario);
public abstract void ensamblaje(Inventario inventario);
public abstract void empaque(Inventario inventario);
public abstract void envioParaAlmacenar(Inventario inventario);

}
