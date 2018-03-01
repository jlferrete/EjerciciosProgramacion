package tercerTrimestre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

class SwingDos implements WindowListener, ActionListener
{
	JButton button1;
	JButton button2;
	public Component createComponents()
	{
		button1 = new JButton("Imagen 1");
		button2 = new JButton("Imagen 2");
		button1.setMnemonic('1');
		button1.addActionListener(this);
		button2.setMnemonic('2');
		button2.addActionListener(this);
		JPanel pane = new JPanel();
		pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		pane.setLayout(new GridLayout(0,1));
		pane.add(button1);
		pane.add(button2);
		return pane;
	}
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e){}
		JFrame frame = new JFrame("Aplicación Swing");
		SwingDos app = new SwingDos();
		Component contens = app.createComponents();
		frame.getContentPane().add(contens, BorderLayout.CENTER);
		frame.setSize(300, 200);
		frame.addWindowListener(null);
		frame.pack();
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0)
	{
		JDialog jdialog = new JDialog();
		JPanel panel = new JPanel();
		Object a;
		a = arg0.getSource();
		// Archivo Nuevo
		if(a.equals(button1))
		{
			panel.setBackground(Color.red);
		}
		else
		{
			panel.setBackground(Color.blue);
		}
		jdialog.setSize(250, 250);
		jdialog.add(panel);
		jdialog.setVisible(true);
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