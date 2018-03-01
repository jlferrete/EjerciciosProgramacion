package primerTrimestre;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Floyd
{
	public static void main(String[] args)
	{
		int numero, n=0;
		String num_lineas = "";
		boolean error;
		BufferedReader lectura = new BufferedReader(new
				InputStreamReader(System.in));
		do{
			error = false;
			System.out.println("Escribir el número de líneas: ");
			System.out.flush();
			try
			{
				num_lineas = lectura.readLine();
				n = Integer.parseInt(num_lineas);
				numero = 1;
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(numero);
						numero++;
					}
					System.out.println();
				}
			}
			catch(Exception e)
			{
				System.out.print("Error");
			}
		}while(error);
	}
}