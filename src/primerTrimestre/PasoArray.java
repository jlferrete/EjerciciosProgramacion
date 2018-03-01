package primerTrimestre;

public class PasoArray
{
	public static void main(String[] args)
	{
		int num[] = {20};
		int l;
		String nombres[] = {"Pepe", "Ana", "Lorenzo"};
		System.out.println("En el programa principal...");
		for(int i = 0; i<nombres.length;i++)
		{
			System.out.println(nombres[i]);
		}
		System.out.println();
		MiProcedimiento(nombres,num);
		System.out.println("En el programa principal...");
		for(int i = 0; i<nombres.length;i++)
		{
			System.out.println(nombres[i]);
		}
		System.out.println("Mi número es " + num[0]);
	}
	public static void MiProcedimiento(String nom[], int n[])
	{
		System.out.println("En el procedimiento...");
		n[0]++;
		nom[0]="Paco";
		for(int i = 0; i<nom.length;i++)
		{
			System.out.println(nom[i]);
		}
		System.out.println();
	}
}