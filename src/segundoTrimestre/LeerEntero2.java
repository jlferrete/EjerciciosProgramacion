package segundoTrimestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerEntero2
{
	public static void main(String[] args) throws IOException
	{
		int n;
		double d;
		System.out.println("Introduce un número entero...");
		n = leerEntero();
		System.out.println("El entero introducido es el "+n);
		System.out.println("Introduce un número real...");
		d = leerDouble();
		System.out.println("El real introducido es el "+d);
	}
	public static int leerEntero() throws IOException
	{
		String s=null;
		int n=0;
		boolean error;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			s = lectura.readLine();
			error = false;
			try
			{
				n = Integer.parseInt(s);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Se ha pedido un número entero...");
				error = true;
			}
		}while(error);
		return n;
	}
	public static double leerDouble() throws IOException
	{
		String s=null;
		double n=0.0;
		boolean error;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			s = lectura.readLine();
			error = false;
			try
			{
				n = Double.parseDouble(s);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Se ha pedido un número real...");
				error = true;
			}
		}while(error);
		return n;
	}
}