package proyecto_prograii;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Silla> arreglo_sillas = new ArrayList<Silla>();
		Double tesoreria = 0.0;
		Inventario inventario = new Inventario(arreglo_sillas, tesoreria);
		Fabrica_de_Sillas controlFabrica = new Fabrica_de_Sillas();

		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido a control de fabrica de sillas");
		System.out.println("Puede escoger las siguientes opciones: ");
		System.out.println(
				"\n 1. Cargar Ordenes \n 2. Revisar Inventario \n 3. Realizar Ordenes \n 4. Corte de materiales \n 5. Ensamblaje \n 6. Empaque \n 7. Envio Hacia el Almacen \n 0. Salir");

		String opcion = entrada.nextLine(); // Lee la opción después de mostrar las opciones
		do {

			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado Cargar Sillas");
				controlFabrica.cargarSillas(inventario); // Corregido el nombre del método
				System.out.println("Presione ENTER");
				entrada.nextLine();
				System.out.println("Desea continuar?: [s] | [n] ");
				opcion = entrada.nextLine();
				break;
			case "2":
				System.out.println("Ha seleccionado Revisar Inventario");
				controlFabrica.revisarInventario();
				System.out.println("Presione ENTER");
				entrada.nextLine();
				System.out.println("Desea continuar?: [s] | [n] ");
				opcion = entrada.nextLine();

				break;
			case "3":
				System.out.println("Ha seleccionado Realizar Ordenes");
				System.out.println("\n Para comprar: [c] \n Para venta: [v] ");
				String orden = entrada.nextLine();
				controlFabrica.realizarOrdenes(orden);
				System.out.println("Presione ENTER");
				entrada.nextLine();
				System.out.println("Desea continuar?: [s] | [n] ");
				opcion = entrada.nextLine();
				break;
			case "s":
				System.out.println("Puede escoger las siguientes opciones: ");

				System.out.println(
						"\n 1. Cargar Ordenes \n 2. Revisar Inventario \n 3. Realizar Ordenes \n 4. Corte de materiales \n 5. Ensamblaje \n 6. Empaque \n 7. Envio Hacia el Almacen \n 0. Salir");
				opcion = entrada.nextLine();
			}

		} while (!opcion.equalsIgnoreCase("0") || !opcion.equals("n"));
		System.out.println("Que tenga un lindo dia!");
entrada.close();
	}
}
