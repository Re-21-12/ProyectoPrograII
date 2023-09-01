package proyecto_prograii;

import java.util.*;
import java.io.*;
public class Principal {
	public static void main(String[] args) throws IOException{
		ArrayList<Silla> arreglo_sillas = new ArrayList<Silla>();
			Inventario inventario = new Inventario(arreglo_sillas);
			 
		Procesos_Fabrica_de_Sillas procesos_fabrica_sillas= new Procesos_Fabrica_de_Sillas();

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
				procesos_fabrica_sillas.cargarSillas(inventario);
				System.out.println("Presione ENTER");
				entrada.nextLine();
				System.out.println("Desea continuar?: [s] | [n] ");
				opcion = entrada.nextLine();
				break;
			case "2":
				System.out.println("Ha seleccionado Revisar Inventario");
				System.out.println("Presione ENTER");
				entrada.nextLine();
				System.out.println("Desea continuar?: [s] | [n] ");
				opcion = entrada.nextLine();

				break;
			case "3":
				System.out.println("Ha seleccionado Realizar Ordenes");
				System.out.println("\n Para comprar: [c] \n Para venta: [v] ");
				String orden = entrada.nextLine();
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
