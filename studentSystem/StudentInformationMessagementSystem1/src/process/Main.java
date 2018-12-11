package process;

import javax.swing.JFrame;

import window.*;

public class Main {
	public static void main(String arg[]) {
		LoginWindow loginWindow = new LoginWindow();
		MainWindow mainWindow = new MainWindow();
		DetailedWindow detailWindow = new DetailedWindow();
		SortWindow sortWindow = new SortWindow();
		FindWindow findWindow = new FindWindow();
	}
}
