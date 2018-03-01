package primerTrimestre;

import java.io.IOException;

public class LeerCaracteres {
	public static void main(String args[]) throws IOException {
		char c;
		System.out.println("Introduce algunos caracteres...");
		// read() lee el siguiente byte del input stream
		c = (char) System.in.read();
		// read() devuelve un int, necesito casting a char
		System.out.println("Los caracteres introducidos son:");
		while (c != '\n') {
			System.out.println(c);
			c = (char) System.in.read();
		}
	}
}
