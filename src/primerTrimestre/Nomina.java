package primerTrimestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Nomina
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new
				InputStreamReader(System.in));
		int eurosHora = 15;
		int horas, n;
		double bruto, impuestosPrimerTramo;
		double impuestosSegundoTramo = 1000.0*25 /100.0;
		double tope1 = 500.0;
		double tope2 = 1000.0;
		System.out.println("Indicar número de trabajadores a procesar:");
		n = Integer.parseInt(lectura.readLine());
		while(n>0)
		{
			System.out.println("Indicar número de horas:");
			horas = Integer.parseInt(lectura.readLine());
			bruto = horas * eurosHora;
			if(horas > 38)
			{
				bruto = bruto + (horas -38) * eurosHora * 1.5;
			}
			impuestosPrimerTramo = 0;
			if(bruto>(tope1+tope2))
			{
				impuestosPrimerTramo = impuestosSegundoTramo + (bruto -
						(tope1+tope2)) * 45 / 100;
			}
			else if(bruto>tope1)
			{
				impuestosPrimerTramo = (bruto - tope1) * 25 / 100;
			}
			System.out.println("Bruto: " + bruto);
			System.out.println("Impuestos: " + impuestosPrimerTramo);
			System.out.println("Neto: " + (bruto-impuestosPrimerTramo));
			n--;
		}
	}
}
