package primerTrimestre.contador;

public class Contador
{
	int contador;
	public Contador()
	{
		contador = 0;
	}
	public Contador(int c)
	{
		contador = c;
	}
	public int incrementarContador()
	{
		contador++;
		return contador;
	}
	public int decrementarContador()
	{
		contador--;
		return contador;
	}
	public int inicializarContador()
	{
		contador=0;
		return contador;
	}
	public int valorContador()
	{
		return contador;
	}
}