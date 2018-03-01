package tercerTrimestre;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MiniNotePad extends Frame implements WindowListener, ActionListener
{
private static final long serialVersionUID = 1L;
MenuBar barraMenu = new MenuBar();
Menu menuArchivo = new Menu("Archivo");
MenuItem mniArchivoAbrir = new MenuItem("Abrir");
MenuItem mniArchivoGuardar = new MenuItem("Guardar");
MenuItem mniArchivoSalir = new MenuItem("Salir");
TextArea areaTexto = new TextArea("", 5, 20);
FileDialog fdL = new FileDialog(this, "Seleccionar archivo", FileDialog.LOAD);
FileDialog fdS = new FileDialog(this, "Seleccionar archivo", FileDialog.SAVE);
Dialog dialog = new Dialog(this);
public MiniNotePad()
{
setLayout( new GridLayout( 1,1 ) );
setTitle ("Menú" );
//Establecemos la barra de menú
setMenuBar(barraMenu);
//Seguimos con los elementos de archivo
menuArchivo.add(mniArchivoGuardar);
menuArchivo.add(mniArchivoAbrir);
//Añadimos un separador
menuArchivo.addSeparator();
menuArchivo.add(mniArchivoSalir);
barraMenu.add(menuArchivo);
add(areaTexto);
addWindowListener(this);
mniArchivoAbrir.addActionListener(this);
mniArchivoGuardar.addActionListener(this);
mniArchivoSalir.addActionListener(this);
fdL.setDirectory("C:\\");
fdL.setFile("*.txt");
fdS.setDirectory("C:\\");
fdS.setFile("*.txt");
setLocationRelativeTo(null);
setSize(600,600);
setVisible(true);
dialog.setSize(200, 200);
}
public static void main(String[] args)
{
new MiniNotePad();
}
public void actionPerformed(ActionEvent ae)
{
Object a;
a=ae.getSource();
if(a.equals(mniArchivoSalir))
{
System.exit(0);
}
else if(a.equals(mniArchivoAbrir))
{
fdL.setFile(".bin");
fdL.setVisible(true);
String fichero = fdL.getDirectory() + fdL.getFile();
String abrir = "";
try
{
FileInputStream fr = new FileInputStream(fichero);
BufferedInputStream bis = new BufferedInputStream(fr);
ObjectInputStream entrada = new ObjectInputStream(bis);
String s="";
abrir = (String) entrada.readObject();
areaTexto.setText(abrir);
entrada.close();
bis.close();
fr.close();
}
catch (IOException e)
{
System.out.println("Se produjo un error de Archivo");
}
catch(ClassNotFoundException e)
{
System.out.println("Se produjo un error de Archivo 2");
}
}
else if(a.equals(mniArchivoGuardar))
{
fdS.setFile(".bin");
fdS.setVisible(true);
String fichero = fdS.getDirectory() + System.getProperty("file.separator") +
fdS.getFile();
try
{
// Destino de los datos
FileOutputStream fw = new FileOutputStream(fichero);
BufferedOutputStream bw = new BufferedOutputStream(fw);
// Objeto para la escritura
ObjectOutputStream salida = new ObjectOutputStream(bw);
//Guardamos la primera línea
salida.writeObject(areaTexto.getText());
//Cerrar el objeto salida, el objeto bw y el fw
salida.close();
bw.close();
fw.close();
}
catch(IOException i)
{
System.out.println("Se produjo un error de Archivo");
}
}
}
public void windowActivated(WindowEvent we) {}
public void windowClosed(WindowEvent we) {}
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
public void windowDeactivated(WindowEvent we) {}
public void windowDeiconified(WindowEvent we) {}
public void windowIconified(WindowEvent we) {}
public void windowOpened(WindowEvent we) {}
}