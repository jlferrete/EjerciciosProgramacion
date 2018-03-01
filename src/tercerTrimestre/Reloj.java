package tercerTrimestre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;

public class Reloj extends Frame implements WindowListener, Runnable
{
	private static final long serialVersionUID = 1L;
	int lastxs = 0;
	int lastys = 0;
	int lastxm = 0;
	int lastym = 0;
	int lastxh = 0;
	int lastyh = 0;
	static Thread thread = null;
	public Reloj()
	{
		setTitle("Reloj");
		this.setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		setSize(210,230);
		addWindowListener(this);
		setVisible(true);
		if(thread==null)
		{
			thread = new Thread(this);
			thread.start();
		}
	}
	public static void main(String args[])
	{
		new Reloj();
	}
	public void run()
	{
		while(thread!=null)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
			}
			repaint();
		}
		thread = null;
	}
	public void paint(Graphics g)
	{
		int xh, yh, xm, ym, xs, ys, s, m, h, hh, xcenter, ycenter;
		String horaCompleta;
		Calendar calendar = Calendar.getInstance();
		h = calendar.get(Calendar.HOUR);
		hh = calendar.get(Calendar.HOUR_OF_DAY);
		m = calendar.get(Calendar.MINUTE);
		s = calendar.get(Calendar.SECOND);
		if(hh<10)
		{
			horaCompleta = "0"+hh;
		}
		else
		{
			horaCompleta = hh+"";
		}
		if(m<10)
		{
			horaCompleta = horaCompleta+":0"+m;
		}
		else
		{
			horaCompleta = horaCompleta+":"+m;
		}
		if(s<10)
		{
			horaCompleta = horaCompleta+":0"+s;
		}
		else
		{
			horaCompleta = horaCompleta+":"+s;
		}
		Dimension dim = this.getSize();
		xcenter = (int)dim.getWidth()/2;
		ycenter = (int)dim.getHeight()/2;
		xs=(int)(Math.cos(s*3.14f/30-3.14f/2)*45+xcenter);
		ys=(int)(Math.sin(s*3.14f/30-3.14f/2)*45+ycenter);
		xm=(int)(Math.cos(m*3.14f/30-3.14f/2)*40+xcenter);
		ym=(int)(Math.sin(m*3.14f/30-3.14f/2)*40+ycenter);
		xh=(int)(Math.cos((h*30+m/2)*3.14f/180-3.14f/2)*30+xcenter);
		yh=(int)(Math.sin((h*30+m/2)*3.14f/180-3.14f/2)*30+ycenter);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 14));
		g.setColor(Color.blue);
		g.drawOval(xcenter-50,ycenter-50,100,100);
		g.setColor(Color.darkGray);
		g.drawString("12", xcenter-5,ycenter-37);
		g.drawString("·", xcenter+18,ycenter-29);
		g.drawString("·", xcenter+33,ycenter-15);
		g.drawString("3", xcenter+40,ycenter+3);
		g.drawString("·", xcenter+32,ycenter+25);
		g.drawString("·", xcenter+17,ycenter+39);
		g.drawString("6", xcenter-3,ycenter+45);
		g.drawString("·", xcenter-20,ycenter+37);
		g.drawString("·", xcenter-35,ycenter+22);
		g.drawString("9", xcenter-45,ycenter+3);
		g.drawString("·", xcenter-35,ycenter-15);
		g.drawString("·", xcenter-19,ycenter-28);
		g.drawString(horaCompleta, xcenter-25,ycenter+70);
		g.setColor(Color.darkGray);
		g.drawLine(xcenter,ycenter,xs,ys);
		g.setColor(Color.red);
		g.drawLine(xcenter,ycenter-1,xm,ym);
		g.drawLine(xcenter-1,ycenter,xm,ym);
		g.drawLine(xcenter,ycenter-1,xh,yh);
		g.drawLine(xcenter-1,ycenter,xh,yh);
		lastxs = xs;
		lastys = ys;lastxm = xm;
		lastym = ym;
		lastxh = xh;
		lastyh = yh;
	}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0)
	{
		thread = null;
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
}