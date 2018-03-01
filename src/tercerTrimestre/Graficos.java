package tercerTrimestre;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Graficos extends Frame implements WindowListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Graficos()
	{
		setTitle("Gráficos");
		setLayout(new FlowLayout());
		setSize(410,430);
		addWindowListener(this);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Graficos();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fill3DRect(50, 55, 300, 150, true);
		g.setColor(Color.blue);
		g.fillOval(50, 55, 300, 150);
		g.setColor(Color.green);
		g.fillOval(125, 25, 150, 150);
		g.setColor(Color.white);
		Polygon p = new Polygon();
		p.addPoint(200, 125);
		p.addPoint(125, 100);
		p.addPoint(275, 100);
		p.addPoint(200, 175);
		g.fillPolygon(p);
		g.setColor(Color.red);
		g.setFont(new Font("Helvetica", Font.BOLD, 24));
		g.drawString("¡JAVA!", 165, 100);
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