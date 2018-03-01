package tercerTrimestre;

public class ThreadEjemplo1 extends Thread
{
	public ThreadEjemplo1(String str)
	{
		super(str);
	}
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(i+" " + getName());
		}
		System.out.println("Termina thread " + getName());
	}
	public static void main(String[] args)
	{
		new ThreadEjemplo1("Uno").start();
		new ThreadEjemplo1("Dos").start();
		System.out.println("Termina thread principal");
	}
}