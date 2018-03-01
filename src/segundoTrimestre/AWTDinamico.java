package segundoTrimestre;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class AWTDinamico extends Frame implements WindowListener {
	private static final long serialVersionUID = 1L;

	public AWTDinamico() {
		setLayout(new FlowLayout());
		addWindowListener(this);
		setSize(90, 140);
		setResizable(false);
		setVisible(true);
		for (int i = 0; i < 15; i++) {
			add(new Button(Integer.toString(i)));
			validate();
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new AWTDinamico();
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}
}