package segundoTrimestre;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Dialogos extends Frame implements WindowListener,
ActionListener
{
	private static final long serialVersionUID = 1L;
	Button btnDialogo = new Button("Di�logo Normal");
	Button btnFileDialog = new Button("Di�logo tipo Examinar");
	//Crear el di�logo indicando el padre, el t�tulo y si es o no
	//modal
	Dialog dlgUno = new Dialog(this, "Di�logo con mensaje", true);
	// Los par�metros significan los siguiente:
	// this para el Frame "padre", el t�tulo del di�logo y el modo: 0 para LOAD, 1 para SAVE
	FileDialog dlgDos = new FileDialog(this,"Elegir fichero...", 0);
	Label lblEtiqueta = new Label("Programando en JAVA...");
	public Dialogos()
	{
		//Definir la Ventana principal
		setLayout(new FlowLayout());
		setTitle("Ventana con Di�logo");
		setSize(300, 100);
		add(btnDialogo);
		add(btnFileDialog);
		btnDialogo.addActionListener(this);
		btnFileDialog.addActionListener(this);
		addWindowListener(this);
		//Definir el Di�logo
		dlgUno.setLayout(new FlowLayout());
		dlgUno.add(lblEtiqueta);
		dlgUno.setSize(200,150);
		//Para poder cerrar el Di�logo
		dlgUno.addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Dialogos();
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object a = ae.getSource();
		if(a.equals(btnDialogo))
		{
			dlgUno.setVisible(true);
		}
		else
		{
			// Establecemos el directorio ra�z inicialmente, aunque guardar� la �ltima ubicaci�n
			dlgDos.setDirectory("c:\\");
			dlgDos.setVisible(true);
			// Mostramos por consola el nombre del fichero elegido
			System.out.println("El fichero elegido es '"+dlgDos.getFile()+"'");
		}
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		if(dlgUno.isActive())
		{
			dlgUno.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}