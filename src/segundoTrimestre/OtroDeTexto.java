package segundoTrimestre;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OtroDeTexto extends Frame implements WindowListener,
TextListener
{
	private static final long serialVersionUID = 1L;
	Label lblEtiqueta = new Label("Escribe un texto");
	TextField txtUno = new TextField(5);
	TextField txtDos = new TextField(5);
	public OtroDeTexto()
	{
		setLayout(new FlowLayout());
		add(lblEtiqueta);
		add(txtUno);
		add(txtDos);
		txtUno.addTextListener(this);
		addWindowListener(this);
		setSize(40,190);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new OtroDeTexto();
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
	public void textValueChanged(TextEvent arg0)
	{
		txtDos.setText(txtUno.getText());
	}
}