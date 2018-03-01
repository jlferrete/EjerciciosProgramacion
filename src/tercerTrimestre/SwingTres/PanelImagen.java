package tercerTrimestre.SwingTres;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class PanelImagen extends javax.swing.JPanel
{
	private static final long serialVersionUID = 1L;
	String nombre;
	public PanelImagen(String nombre)
	{
		this.nombre = nombre;
		this.setSize(400,280);
	}
	public void paintComponent (Graphics g)
	{
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new
				ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width,
				tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}