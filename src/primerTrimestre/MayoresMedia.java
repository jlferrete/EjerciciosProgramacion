package primerTrimestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MayoresMedia
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new
				InputStreamReader(System.in));
		int Maximo = 5;
		int vector[] = new int[Maximo];
		int acumulado = 0, media, numMayores = 0, numMenores = 0;
		for(int i=0; i <Maximo; i++)
		{
			System.out.println("Introduce una altura...");
			vector[i] = Integer.parseInt(lectura.readLine());
			acumulado = acumulado + vector[i];
		}
		media = acumulado / Maximo;
		for(int i=0; i <Maximo; i++)
		{
			if(vector[i]>media)
			{
				numMayores++;
			}
			else
			{
				numMenores++;
			}
		}
		System.out.println("La media es "+media);
		System.out.println("Hay "+numMayores+" mayores que la media");
		System.out.println("Hay "+numMenores+" menores que la media");
	}
}