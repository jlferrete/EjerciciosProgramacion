package tercerTrimestre;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class SwingUno implements WindowListener, ActionListener
{
	static String etiqueta ="Número de pulsaciones: ";
	int pulsaciones = 0;
	final JLabel label = new JLabel(etiqueta+"0");
	public Component createComponents()
	{
		JButton button = new JButton("Soy un botón Swing");
		button.setMnemonic('i');
		button.addActionListener(this);
		label.setLabelFor(button);
		JPanel pane = new JPanel();
		pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		pane.setLayout(new GridLayout(0,1));
		pane.add(button);
		pane.add(label);
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
		SwingUno app = new SwingUno();
		Component contens = app.createComponents();
		frame.getContentPane().add(contens, BorderLayout.CENTER);
		frame.setSize(100, 200);
		frame.addWindowListener(null);
		frame.pack();
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0)
	{
		pulsaciones++;
		label.setText(etiqueta+pulsaciones);
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