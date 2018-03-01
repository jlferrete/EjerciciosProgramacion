package tercerTrimestre.SwingTres;

import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;

public class SwingTres implements WindowListener,
ActionListener
{
	JButton button1;
	JButton button2;
	static JFrame frame;
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
		frame = new JFrame("Aplicación Swing");
		SwingTres app = new SwingTres();
		Component contens = app.createComponents();
		frame.getContentPane().add(contens, BorderLayout.CENTER);
		frame.setSize(300, 200);
		frame.addWindowListener(null);
		frame.pack();
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0)
	{
		// JDialog que aparecerá al pulsar los botones
		JDialog jdialog = new JDialog();
		// JPanel que se meterá en el JDialog y que contendrá las imágenes
		PanelImagen p;
		// Objeto que genera el Evento
		Object a;
		a = arg0.getSource();
		if(a.equals(button1))
		{
			// Al crear el JPanel, damos la ruta de la imagen
			p = new PanelImagen(".\\start.png");
		}
		else
		{
			// Al crear el JPanel, damos la ruta de la imagen
			p = new PanelImagen(".\\stop.png");
		}
		// Establecemos características del JPanel
		p.setBorder(new EmptyBorder(100, 100, 100, 100));
		p.setLayout(new BorderLayout(0, 0));
		// Establecemos características del JDialog
		jdialog.setSize(250, 250);
		//Añadimos el JPanel al JDialog
		jdialog.add(p);
		//Hacemos visible el JDialog
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