package proyecto_prograii;

import java.util.*;
import java.io.*;
//import implementacion_interfaces.Producto;

public class Fabrica_de_Sillas implements Interfaz_Fabrica_de_Sillas {
	private Inventario inventario;
	private Metodos_de_revision metodosDeRevision = new Metodos_de_revision();

	// getter & setters
	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public Metodos_de_revision getMetodosDeRevision() {
		return metodosDeRevision;
	}

	public void setMetodosDeRevision(Metodos_de_revision metodosDeRevision) {
		this.metodosDeRevision = metodosDeRevision;
	}

	// constructor
	/**
	 * @param inventario
	 * @param metodosDeRevision
	 */
	public Fabrica_de_Sillas(Inventario inventario, Metodos_de_revision metodosDeRevision) {
		super();
		this.inventario = inventario;
		this.metodosDeRevision = metodosDeRevision;
	}
	public Fabrica_de_Sillas() {
	}
//toString
	@Override
	public String toString() {
		return "Fabrica_de_Sillas [inventario=" + inventario + ", metodosDeRevision=" + metodosDeRevision + "]";
	}

	// metodos
	public void cargarSillas(Inventario inventario) {
		ArrayList<Silla> inventario_cargado = inventario.getSillas();
		Scanner entrada = new Scanner(System.in);
		String salir;
		do {
			System.out.println("Esta ingresando los datos para los materiales: ");
			System.out.println("Ingrese una cantidad de pegamento: ");
			String pegamento = entrada.nextLine();
			System.out.println("Ingrese una cantidad de barniz: ");
			String barniz = entrada.nextLine();
			System.out.println("Ingrese una cantidad de trozos de madera: ");
			String madera = entrada.nextLine();
			System.out.println("Ingrese una cantidad de clavos: ");
			String clavos = entrada.nextLine();
			System.out.println("Ingrese una cantidad de lijas: ");
			String lija = entrada.nextLine();

			Material materiales = new Material(pegamento, barniz, madera, clavos, lija);

			System.out.println("Esta ingresando los datos para la fabricacion de sillas: ");

			System.out.println("Ingrese el tipo de orden el producto: [c] Compra || [v] Venta");
			String orden = entrada.nextLine();
			System.out.println("Ingrese un tipo de silla");
			String tipoDeSilla = entrada.nextLine();
			System.out.println("Ingrese una cantidad de sillas");
			String cantidadDeSillas = entrada.nextLine();
			System.out.println("Ingrese un costo para las sillas");
			String costo = entrada.nextLine();
			System.out.println("Presione Enter para continuar");

			entrada.nextLine();
			System.out.println("Desea continuar? : [s] SI || [n] NO");
			// opcion para salir
			salir = entrada.nextLine();
			// agregar al arreglo
			inventario_cargado.add(new Silla(materiales, orden, tipoDeSilla, cantidadDeSillas, costo));
			inventario.setSillas(inventario_cargado);
		} while (!salir.equalsIgnoreCase("n"));
		// cargando el archivo
		System.out.println("Se esta cargando el archivo...");
		for (Silla silla : inventario_cargado) {
			try {
				metodosDeRevision.registrarSillas(silla);
				System.out.println(silla);
			} catch (Exception e) {
				System.err.println("Ha ocurrido un error al cargar el archivo");
				e.printStackTrace();
			}
		}
		System.out.println("Ha cargado el inventario");
		// entrada.close();

	}

	public void revisarInventario() {
   try{
	   metodosDeRevision.consultarSillas();
   }catch(IOException e) {
	   System.err.println(e);
   }
	}

	public void realizarOrdenes(String orden) {
		try{
			metodosDeRevision.consultarSillasPorOrden(orden);
		}catch(IOException e) {
			System.err.println(e);
		}
	}

	public void corteDeMateriales(Inventario inventario) {

	}

	public void ensamblaje(Inventario inventario) {

	}

	public void empaque(Inventario inventario) {

	}

	public void envioParaAlmacenar(Inventario inventario) {

	}
}
