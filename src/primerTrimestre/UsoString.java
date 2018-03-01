package primerTrimestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsoString {
	public static void main(String[] args) throws IOException {
		String nombre = null;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame tu nombre...");
		nombre = lectura.readLine();
		System.out.println("Tu nombre es: " + nombre);
	}
}
