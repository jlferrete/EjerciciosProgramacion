package segundoTrimestre;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Portapapeles {
	public static void main(String[] args) throws IOException
	{
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		BufferedReader entrada= new BufferedReader(new
				InputStreamReader(System.in));
		String textoInicial = null;
		System.out.println("Escribir lo que se copiará al portapapeles:");
		textoInicial=entrada.readLine();
		StringSelection porta = new StringSelection(textoInicial);
		cb.setContents(porta, porta);
		Transferable t = cb.getContents(cb);
		try
		{
			// Construimos el DataFlavor correspondiente a String.
			DataFlavor dataFlavorStringJava = new DataFlavor("application/xjava-serialized-object; class=java.lang.String");
			// Si el dato se puede obtener como String, lo obtenemos y lo sacamos por la estándar out.
			if (t.isDataFlavorSupported(dataFlavorStringJava))
			{
				String textoFinal = (String)
						t.getTransferData(dataFlavorStringJava);
				System.out.println(textoFinal);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}
}