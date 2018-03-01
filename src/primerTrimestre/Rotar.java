package primerTrimestre;

public class Rotar
{
	public static void main(String[] args)
	{
		
		// Para que funciones hay que introducir parametros en el main
		// Se hace en run configurations/arguments
		
		int i, j, longitud;
		char cadena[];
		char temp;
		if(args.length>0)
		{
			longitud = args[0].length();
			cadena = args[0].toCharArray();
			System.out.println(cadena);
			for(j=0;j<longitud;j++)
			{
				temp = cadena[0];
				for(i=1;i<longitud;i++)
				{
					cadena[i-1] = cadena[i];
				}
				cadena[longitud-1] = temp;
				System.out.println(cadena);
			}
		}
	}
}
