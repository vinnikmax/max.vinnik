package by.max;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e = new Engine("Калькулятор");
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		e.setSize(500, 500);
		e.setResizable(true);
		e.setLocation(300, 150);
	}

}
