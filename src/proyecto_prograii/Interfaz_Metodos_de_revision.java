package proyecto_prograii;

import java.io.*;
public interface Interfaz_Metodos_de_revision {

	//aqui se busca crear la interfaz para los archivos secuenciales
	//public abstract void formatoSilla(Silla silla, BufferedWriter bw)throws IOException;
	public abstract void registrarSillas(Silla silla)throws IOException;
	public abstract void consultarSillasPorOrden(String orden)throws IOException;
	public abstract void consultarSillas()throws IOException;
	public abstract void corteDeMateriales() throws IOException;

}
