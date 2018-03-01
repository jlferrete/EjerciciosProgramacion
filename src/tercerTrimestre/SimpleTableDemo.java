package tercerTrimestre;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class SimpleTableDemo
{
	public static void main(String args[])
	{
		final String columnNames[] = { "Jugador", "Puntuación" };
		final Object rowData[][] = {
				{ "Jugador1", "10"},
				{ "Jugador2", "5"},
				{ "Jugador3", "8"},
				{ "Jugador4", "30"},
				{ "Jugador5", "50"},
				{ "Jugador6", "40"},
				{ "Jugador7", "12"},
				{ "Jugador8", "60"},
				{ "Jugador9", "5"},
				{ "Jugador10", "37"}
		};
		final JTable table = new JTable(rowData, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		JFrame frame = new JFrame("Tabla de datos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(scrollPane, BorderLayout.CENTER);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}