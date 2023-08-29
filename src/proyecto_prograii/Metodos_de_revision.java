package proyecto_prograii;

import java.io.*;
import java.util.*;

public class Metodos_de_revision implements Interfaz_Metodos_de_revision {
	private File nombre_archivo = new File("Inventario.txt");

	private void formatoSilla(Silla silla, BufferedWriter bw) throws IOException {
		try {
			// obtenemos los materiales dentro de silla
			Material material = silla.getMaterial();
			// los destructuramos
			// para material usamos & ya que es un obketo aparte
			String materialStr = material.getPegamento() + "%" + material.getBarniz() + "%" + material.getMadera() + "%"
					+ material.getClavos() + "%" + material.getLija();// llega hasta [8] osoea 4,5,6,7,8
			// destructuramos silla para obtener mas orden
			// para silla usamos % ya que es un obketo aparte
			String sillaStr = silla.getOrden() + "%" + silla.getTipoDeSilla() + "%" + silla.getCantidadDeSillas() + "%"
					+ silla.getCosto(); // lega hasta [3] osea 0,1,2,3
			
			// primeto estamos scribiendo el obketo silla y luego el objeto material
			bw.write(sillaStr + "%" + materialStr);
			bw.newLine();

			bw.close();

		} catch (Exception e) {
			System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public void registrarSillas(Silla silla) throws IOException {
		try {
			if (this.nombre_archivo.exists() && this.nombre_archivo.length() != 0) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(this.nombre_archivo, true));
				formatoSilla(silla, bw);
			} else {
				BufferedWriter bw = new BufferedWriter(new FileWriter(this.nombre_archivo));
				formatoSilla(silla, bw);

			}
		} catch (Exception e) {
			System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public void consultarSillasPorOrden(String orden) throws IOException {
		try {
			int cantidad = 0; Double costo = 0.0;
			String linea;
			if (this.nombre_archivo.exists() && this.nombre_archivo.length() != 0) {
				BufferedReader br = new BufferedReader(new FileReader(this.nombre_archivo));
				while ((linea = br.readLine()) != null) {
					// el metodo split crea un arreglo
					String[] Atributos = linea.split("%");
					Material materiales = new Material(Atributos[4], Atributos[5], Atributos[6], Atributos[7],
							Atributos[8]);
					// como tambien le debemos pasar material por sus materiales debemos crear un
					// objeto de material de la clase material
					// por el siguiente formato debemos ordenarlo para coonvertir bien los datos
					/*
					 * public Silla(Material material, String orden, String tipoDeSilla, String
					 * cantidadDeSillas, String costo) { super(); this.material = material;
					 * this.orden = orden; this.tipoDeSilla = tipoDeSilla; this.cantidadDeSillas =
					 * cantidadDeSillas; this.costo = costo; }
					 */
					Silla silla = new Silla(materiales, Atributos[0], Atributos[1], Atributos[2], Atributos[3]);
					// depende del tipo de orden
					switch (silla.getOrden()) {
					// si el orden en su get es c entonces
					case "c":
						//obtenemos la cantidad total de sillas
						cantidad += Integer.parseInt(silla.getCantidadDeSillas());
						//obtenemos el costo de armar la silla
						costo += Double.parseDouble(silla.getCosto())* Integer.parseInt(silla.getCantidadDeSillas());
						System.out.println("El costo total es de :" + costo);
						System.out.println("El cantidad total de sillas es de :" + cantidad);
						
						
						//realizar aqui los precios
						break;
					// si el orden en su get es v entonces

					case "v":
						//obtenemos la cantidad total de sillas
						cantidad += Integer.parseInt(silla.getCantidadDeSillas());
						//obtenemos el costo de armar la silla
						costo += Double.parseDouble(silla.getCosto())* Integer.parseInt(silla.getCantidadDeSillas());
						System.out.println("El costo total es de :" + costo);
						System.out.println("El cantidad total de sillas es de :" + cantidad);
						
					
						break;

					}
				}
				br.close();
			} else {
				System.out.println("Archivo no encontrado");
			}
		} catch (Exception e) {
			System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();

		}
	}

	public void consultarSillas() throws IOException {
		try {
			String linea;
			if (this.nombre_archivo.exists() && this.nombre_archivo.length() != 0) {
				BufferedReader br = new BufferedReader(new FileReader(this.nombre_archivo));
				while ((linea = br.readLine()) != null) {
					// el metodo split crea un arreglo
					String[] Atributos = linea.split("%");
					Material materiales = new Material(Atributos[4], Atributos[5], Atributos[6], Atributos[7],
							Atributos[8]);
					Silla silla = new Silla(materiales, Atributos[0], Atributos[2], Atributos[3], Atributos[4]);
					System.out.println("El inventario contiene: ");

					System.out.println(silla.toString());

				}
				br.close();
			}
		} catch (Exception e) {
			System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}
	}
	public void corteDeMateriales() throws IOException {
		try {
			String linea;
			if (this.nombre_archivo.exists() && this.nombre_archivo.length() != 0) {
				BufferedReader br = new BufferedReader(new FileReader(this.nombre_archivo));
				while ((linea = br.readLine()) != null) {
					// el metodo split crea un arreglo
					String[] Atributos = linea.split("%");
					Material materiales = new Material(Atributos[4], Atributos[5], Atributos[6], Atributos[7],
							Atributos[8]);
					Silla silla = new Silla(materiales, Atributos[0], Atributos[2], Atributos[3], Atributos[4]);
					if(silla.getOrden().equalsIgnoreCase("c")) {
						System.out.println("Los materiales obtenidos son : ");
						ArrayList<Integer> cantidad = new ArrayList<Integer>();						
						ArrayList<Double> precio = new ArrayList<Double>();
						//MATERIAL me debe traer un objeto con las cantidades por silla o sillas
						//entonces debo asignar un precio y ese asignarlo como su precico de compra
						/*Por ejemplo:
						 * 0.25kg -> Q27,06 = (cantidad_pegamento en kg * precio)/0.25kg -> 0.12 50 * 27.00 = 3.3825Q
						 * 0.9463kg -> Q75,00 = (cantidad_barniz en kg * precio)/0.9463kg = 39 Quetzales por 1/4 de barniz
						 *  3 pedazos de  madera -> Q100 
						 *  =necesitamos 10 clavos de una bolsa de 40 de 0.454clavos -> 2.25 Q
						 *   2 lijas  10Q
						 * */
						cantidad.add(Integer.parseInt(silla.getCantidadDeSillas()));
						precio.add(Double.parseDouble(silla.getCosto()));
						
					}

				}
				br.close();
			}
		} catch (Exception e) {
			System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
