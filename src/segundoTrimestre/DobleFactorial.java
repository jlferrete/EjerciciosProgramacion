package segundoTrimestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DobleFactorial {
	public static void main(String[] args) throws IOException {
		int n, resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el valor de n: ");
		n = Integer.parseInt(lectura.readLine());
		resultado = dobleFactorial(n);
		System.out.println("El doble factorial para el n dado vale " + resultado);
	}

	static int dobleFactorial(int x) {
		int r;
		if ((x == 0) || (x == 1)) {
			r = 1;
		} else {
			r = x * dobleFactorial(x - 2);
		}
		return r;
	}
}