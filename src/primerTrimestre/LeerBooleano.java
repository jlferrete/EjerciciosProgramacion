package primerTrimestre;

import java.io.IOException;

public class LeerBooleano {
	public static void main(String[] args) throws IOException {
		do {
			System.out.println("¿Deseas continuar (s/n)?");
		} while (leerBooleano());
	}

	public static boolean leerBooleano() throws IOException {
		char c;
		boolean r = false;
		boolean error = false;
		c = (char) System.in.read();
		// Saltar los caracteres que caben en el buffer y así dejo el buffer vacío
		System.in.skip(256);
		if (c == 's' || c == 'S') {
			r = true;
		} else if (c == 'n' || c == 'N') {
			r = false;
		} else {
			error = true;
		}
		while (error == true) {
			error = false;
			System.out.println("¿Deseas continuar (s/n)?");
			c = (char) System.in.read();
			System.in.skip(256);
			if (c == 's' || c == 'S') {
				r = true;
			} else if (c == 'n' || c == 'N') {
				r = false;
			} else {
				error = true;
			}
		}
		return r;
	}
}
