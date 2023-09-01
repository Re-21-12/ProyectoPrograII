package proyecto_prograii;

import java.util.*;

import java.io.*;
//import implementacion_interfaces.Producto;

public class Procesos_Fabrica_de_Sillas implements Interfaz_Procesos_Fabrica_de_Sillas {

	// metodos
	public void cargarSillas(Inventario inventario) throws IOException {
		ArrayList<Silla> inventario_sillas = inventario.getSillas();
		ArrayList<Material> inventario_materiales = new ArrayList<Material>();

		Scanner entrada = new Scanner(System.in);

		String salir;
		try {

			do {
				// Materiales
				// Proveedor de los materiales
				/*
				 * System.out.println("A continuacion ingrese la informacion del proveedor: ");
				 * System.out.println("Ingrese un id del proveedor: "); String Id_proveedor =
				 * entrada.nextLine(); System.out.println("Ingrese un nombre del proveedor: ");
				 * 
				 * String nombre = entrada.nextLine();
				 * System.out.println("Ingrese un numero de telefono del proveedor: ");
				 * 
				 * String numero_telefono = entrada.nextLine();
				 * System.out.println("Ingrese una direccion del proveedor: ");
				 * 
				 * String Direccion = entrada.nextLine();
				 * System.out.println("Ingrese un correo electronico del proveedor: "); String
				 * correo = entrada.nextLine();
				 * System.out.println("Ingrese el nombre del producto proveido: "); String
				 * productos_proveidos = entrada.nextLine();
				 */
				System.out.println("Esta ingresando los materiales para la fabricacion de sillas: ");
				System.out.println("Ingrese nombre del material: ");
				String nombre_material = entrada.nextLine();
				System.out.println("Ingrese una cantidad: ");
				Integer cantidad = entrada.nextInt();
				System.out.println("Ingrese un costo: ");
				Double costo = entrada.nextDouble();
				String Id = String.valueOf(inventario_materiales.size());
				/*
				 * String informacion_compra = "Producto :" + nombre_material + "Cantidad :" +
				 * cantidad + "Costo :" + costo;
				 *
				 * Proveedor proveedor = new Proveedor(Id_proveedor, nombre, numero_telefono,
				 * Direccion, correo, productos_proveidos, informacion_compra);
				 */Material material = new Material(Id, nombre_material, costo, cantidad);
				System.out.println("Presione Enter para continuar");
				entrada.nextLine();
				System.out.println("Desea agregar mas materiales? : [s] SI || [n] NO");
				salir = entrada.nextLine();
				inventario_materiales.add(material);
			} while (!salir.equalsIgnoreCase("n"));
			System.out.println("Cuantas sillas desea agregar?");
			Integer cantidad_sillas = entrada.nextInt();
			int contador = 0;
			// Silla
			do {

				Double precio_costo = 0.0;
				for (Material materiales : inventario_materiales) {
					precio_costo += materiales.getCosto();
				}
				// pasar esta parte a generar factura
				// incluyendo mano de obra?
				// con iva
				/*
				 * System.out.println("Ingrese un id del distribuidor: "); String
				 * Id_distribuidor = entrada.nextLine();
				 * System.out.println("Ingrese un nombre del distribuidor: "); String nombre =
				 * entrada.nextLine();
				 * System.out.println("Ingrese un numero de telefono del distribuidor: ");
				 * String numero_telefono = entrada.nextLine();
				 * System.out.println("Ingrese una direccion del distribuidor: "); String
				 * Direccion = entrada.nextLine();
				 * System.out.println("Ingrese un correo del distribuidor: "); String correo =
				 * entrada.nextLine(); String productos_distribuidos = "Silla";
				 * System.out.println("Ingrese informacion de ayuda para el distribuidor: ");
				 * String informacion_entrega = entrada.nextLine(); Distribuidor distribuidor =
				 * new Distribuidor(Id_distribuidor, nombre, numero_telefono, Direccion, correo,
				 * productos_distribuidos, informacion_entrega);
				 */
				String id = String.valueOf(inventario_sillas.size());
				Double precio_venta = precio_costo + (precio_costo * 0.12);
				Silla silla = new Silla(id, "silla", precio_costo, precio_venta, inventario_materiales);
				inventario_sillas.add(silla);
				contador++;
			} while (contador < cantidad_sillas);
			inventario.setSillas(inventario_sillas);
			// cargando el archivo
			System.out.println("Ha cargado el inventario");
			for (Silla silla_arreglo : inventario.getSillas()) {
				System.out.println(silla_arreglo);
			}

		} catch (Exception e) {
			System.err.println(e);
		}
	}
	// entrada.close();

	public void revisarInventario(Inventario inventario) throws IOException {
		try {
			ArrayList<Silla> revisar_inventario = inventario.getSillas();
			for(Silla silla: revisar_inventario) {
				System.out.println(silla);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void realizarCompraMaterial(Inventario inventario) throws IOException {
		try {
			if(inventario.getSillas().size() != 0) {
				System.out.println("No necesita comprar material");
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void corteDeMateriales(Inventario inventario) throws IOException {
		try {
			System.out.println("a");

		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void ensamblaje(Inventario inventario) throws IOException {
		try {
			System.out.println("a");

		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void empaque(Inventario inventario) throws IOException {
		try {
			System.out.println("a");

		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void envioParaAlmacenar(Inventario inventario) throws IOException {
		try {
			System.out.println("a");

		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void realizarVentaSillas(Inventario inventario) throws IOException {
		try {
			System.out.println("a");

		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
