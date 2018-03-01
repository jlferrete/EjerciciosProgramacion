package tercerTrimestre;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class ColorBar extends Frame implements WindowListener,
MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	int xpos;
	int ypos;
	int width;
	int height;
	int selectedColor;
	static Color colores[] = {Color.black,Color.gray, Color.red,
			Color.pink, Color.orange, Color.yellow, Color.green, Color.magenta,
			Color.cyan, Color.blue};
	Random rnd=new Random();
	public ColorBar(int x, int y, int w, int h)
	{
		selectedColor = 0;
		xpos = x;
		ypos = y;
		width = w;
		height = h;
		setSize(500,500);
		setResizable(false);
		addWindowListener(this);
		addMouseMotionListener(this);
		repaint();
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(colores[selectedColor]);
		g.fillRect(xpos, ypos, width, height);
	}
	public static void main(String[] arg)
	{
		new ColorBar(100,100,10,10);
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
	public void mouseDragged(MouseEvent arg0) {}
	public void mouseMoved(MouseEvent arg0)
	{
		int x = arg0.getX();
		int y = arg0.getY();
		boolean resultado=false;
		if((xpos<x)&&(x<(xpos+width))&&(ypos<y)&&(y<(ypos+height)))
		{
			resultado = true;
		}
		else
		{
			resultado = false;
		}
		if(resultado)
		{
			if(selectedColor==(colores.length-1))
			{
				selectedColor=0;
			}
			else
			{
				selectedColor++;
			}
			xpos = rnd.nextInt(400)+30;
			ypos = rnd.nextInt(400)+30;
			width = rnd.nextInt(50)+10;
			height = rnd.nextInt(50)+10;
			repaint();
		}
	}
}