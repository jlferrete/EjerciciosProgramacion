package segundoTrimestre;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTRotar extends Frame implements WindowListener,
ActionListener
{
	private static final long serialVersionUID = 1L;
	Button btnAceptar = new Button("Aceptar");
	TextField txtCadena = new TextField("",10);
	TextArea txaResultado = new TextArea(15,15);
	public AWTRotar()
	{
		setLayout(new FlowLayout());
		add(txtCadena);
		add(btnAceptar);
		add(txaResultado);
		btnAceptar.addActionListener(this);
		addWindowListener(this);
		setTitle("Rotar cadenas");
		setSize(100,350);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AWTRotar();
	}
	public void actionPerformed(ActionEvent arg0)
	{
		Object a = new Object();
		a = arg0.getSource();
		if(a.equals(btnAceptar))
		{
			rotar();
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
	public void rotar()
	{
		int i, j, longitud;
		char cadena[];
		char temp;
		String palabra;
		palabra = txtCadena.getText();
		if(palabra.length()>0)
		{
		}
		longitud = palabra.length();
		cadena = palabra.toCharArray();
		txaResultado.setText(palabra+"\n");
		for(j=0;j<longitud;j++)
		{
			temp = cadena[0];
			for(i=1;i<longitud;i++)
			{
				cadena[i-1] = cadena[i];
				txaResultado.setText(txaResultado.getText()+cadena[i-1]);
			}
			cadena[longitud-1] = temp;
			txaResultado.setText(txaResultado.getText()+cadena[longitud-1]+"\n");
			System.out.println(cadena);
		}
	}
}
