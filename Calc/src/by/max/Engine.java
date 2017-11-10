package by.max;

import javax.swing.*;
import javax.swing.JFrame;
import javafx.event.*;
import java.awt.*;
import java.awt.event.*;


public class Engine extends JFrame{
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_point,
			b_c, b_equal, b_plus, b_minus, b_devide, b_multiply ;
	String s;
	JLabel t1, t2;
	JPanel p1, p2;
	float i, k = 0;
	eventOperations operations = new eventOperations();
	
	public Engine (String s) {
		super(s);
		p1 = new JPanel();
		t1 = new JLabel("");
		t2 = new JLabel("");
		t1.setEnabled(true);
		add(p1);
		p1.setLayout(new GridLayout(2, 1));
		p1.add(t1, BorderLayout.CENTER);
		p1.add(t2);
		p2 = new JPanel();
		add(p2, BorderLayout.SOUTH);
		p2.setLayout(new GridLayout(5, 4));
		
		b_point = new JButton(".");
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b_c = new JButton("AC");
		b_equal = new JButton("=");
		b_plus = new JButton("+");
		b_minus = new JButton("-");
		b_devide = new JButton("/");
		b_multiply = new JButton("*");
		
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b_c);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b_plus);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b_minus);
		p2.add(b0);
		p2.add(b_point);
		p2.add(b_devide);
		p2.add(b_multiply);
		p2.add(b_equal);
		
		b0.addActionListener(operations);
		b1.addActionListener(operations);
		b2.addActionListener(operations);
		b3.addActionListener(operations);
		b4.addActionListener(operations);
		b5.addActionListener(operations);
		b6.addActionListener(operations);
		b7.addActionListener(operations);
		b8.addActionListener(operations);
		b9.addActionListener(operations);
		b_point.addActionListener(operations);
		b_c.addActionListener(operations);
		b_plus.addActionListener(operations);
		b_minus.addActionListener(operations);
		b_devide.addActionListener(operations);
		b_multiply.addActionListener(operations);
		b_equal.addActionListener(operations);
		
	}
	
	public class eventOperations implements ActionListener {
		

		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == b0) {
				t1.setText(t1.getText() + "0");
			}
			if (e.getSource() == b1) {
				t1.setText(t1.getText() + "1");
			}
			if (e.getSource() == b2) {
				t1.setText(t1.getText() + "2");
			}
			if (e.getSource() == b3) {
				t1.setText(t1.getText() + "3");
			}
			if (e.getSource() == b4) {
				t1.setText(t1.getText() + "4");
			}
			if (e.getSource() == b5) {
				t1.setText(t1.getText() + "5");
			}
			if (e.getSource() == b6) {
				t1.setText(t1.getText() + "6");
			}
			if (e.getSource() == b7) {
				t1.setText(t1.getText() + "7");
			}
			if (e.getSource() == b8) {
				t1.setText(t1.getText() + "8");
			}
			if (e.getSource() == b9) {
				t1.setText(t1.getText() + "9");
			}
			if (e.getSource() == b_point) {
				if(t1.getText() == "") {
					t1.setText("0.");
				} else
					t1.setText(t1.getText() + ".");
					b_point.setEnabled(false);
			}
			if (e.getSource() == b_c) {
				t1.setText("");
				t2.setText("");
				k = 0;
				b_point.setEnabled(true);
			}
			if (e.getSource() == b_plus) {
				i = Float.parseFloat(t1.getText());
				k = i;
				t2.setText(t1.getText() + " +");
				t1.setText("");
				
			} else if (e.getSource() == b_minus) {
				i = Float.parseFloat(t1.getText());
				k = i;
				t2.setText(String.valueOf(k));
				t1.setText("");
			
			} else if (e.getSource() == b_devide) {
				i = Float.parseFloat(t1.getText());
				k /= i;
				t2.setText(String.valueOf(k));
				t1.setText("");
			
			}else if (e.getSource() == b_multiply) {
				i = Float.parseFloat(t1.getText());
				k *= i;
				t2.setText(String.valueOf(k));
				t1.setText("");
			} 
			
			if (e.getSource() == b_equal) {
				i = Float.parseFloat(t1.getText());
				s = t2.getText();
				if(s.endsWith("+")) {
					k += i;
					t1.setText("");
					t2.setText(String.valueOf(k));
				}
			}
		}
	}

}
