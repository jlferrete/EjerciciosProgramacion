package primerTrimestre;

import java.io.IOException;

public class UsoStringBuffer {
	public static void main(String[] args) throws IOException {
		char c;
		StringBuffer st = new StringBuffer();
		// Los String no permiten cambia su contenido con métodos como append()
		System.out.println("Introduce algunos caracteres...");
		c = (char) System.in.read();
		while (c != '\n') {
			st.append(c);
			c = (char) System.in.read();
		}
		System.out.println("Los caracteres introducidos son:");
		System.out.println(st);
	}
}
