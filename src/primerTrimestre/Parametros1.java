package primerTrimestre;

public class Parametros1
{
	public static void main(String[] args)
	{
		int cantidad, i;
		// Muestra los par�metros metidos en Run>Run Configurations>Arguments
		// Tras meter los par�metros, Apply y Run
		// Primero muestra la cantidad
		System.out.println("Has metido "+args.length+ " par�metros.");
		// Y ahora muestra cada uno de ellos
		cantidad = args.length;
		i = 0;
		while(i<cantidad)
		{
			System.out.println("El valor de args["+i+"] vale "+args[i]);
			i++;
		}
	}
}