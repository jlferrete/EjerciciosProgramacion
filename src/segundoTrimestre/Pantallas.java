package segundoTrimestre;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Pantallas implements WindowListener
{
	Pantallas(int i)
	{
		Frame f = new Frame();
		//f.setSize(100*i, 100*i);
		f.setBounds((int)(Math.random()*100*i),(int)(Math.random()*100*i), 100*i, 100*i);
		f.addWindowListener(this);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		int i;
		for(i=1;i<10;i++)
		{
			new Pantallas(i);
		}
	}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
}