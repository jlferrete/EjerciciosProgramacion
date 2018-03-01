package segundoTrimestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class Encriptar {
	public static void main(String[] args) throws IOException {
		String cadenaOriginal = null;
		String cadenaEncriptada = null;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la cadena a encriptar:");
		cadenaOriginal = lectura.readLine();
		cadenaEncriptada = getSHA256(cadenaOriginal);
		System.out.println("La cadena " + cadenaOriginal + " encriptada en SHA256 es ");
		System.out.println(cadenaEncriptada);
		System.out.println(cadenaEncriptada.length());
	}

	public static String getSHA256(String data) {
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(data.getBytes());
			byte byteData[] = md.digest();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}