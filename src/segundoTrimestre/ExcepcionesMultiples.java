package segundoTrimestre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ExcepcionesMultiples {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("fich1.txt");
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);
			// Guardamos la primera línea
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una cadena:");
			String cadena = in.readLine();
			salida.println(cadena);
			// Cerrar el objeto salida
			salida.close();
		} catch (IOException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Se ha producido una excepción...");
		}
	}
}