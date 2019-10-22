package calculator;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextArea;

import javax.swing.border.Border;

public class calculator implements ActionListener {
	JFrame frame = new JFrame();

	JPanel panel = new JPanel();

	JTextArea tarea = new JTextArea(2, 10);

	// Buttons

	
	JButton c = new JButton();
	
	JButton a = new JButton();
	
	JButton button1 = new JButton();
	
	JButton Square = new JButton();
	
	JButton Pi = new JButton();
	
	JButton button2 = new JButton();

	JButton button3 = new JButton();

	JButton button4 = new JButton();

	JButton button5 = new JButton();

	JButton button6 = new JButton();

	JButton button7 = new JButton();

	JButton button8 = new JButton();

	JButton button9 = new JButton();

	JButton button0 = new JButton();

	JButton buttoAdd = new JButton();

	JButton buttonDivide = new JButton();

	JButton buttonMultiply = new JButton();

	JButton buttonSub = new JButton();

	JButton buttonEqual = new JButton();

	JButton buttonDot = new JButton();

	JButton buttonClear = new JButton();
	
	JButton help = new JButton();
	
	JButton fonz = new JButton();
	
	JButton sqrt = new JButton();
	
	JButton quad = new JButton();
	
	JButton pent = new JButton();

	double number1, number2, result, result1, result2;
	int addc = 0, mulc = 0, divc = 0, subc = 0, square = 0, d = 0, A = 0;
	double r;

	double sum=0;

	int temp;
	public calculator() {
		// The Frame, Name, Panel, and TextArea.
		frame.setSize(450, 600);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

		frame.setTitle("Calculator by Viraj");

		frame.add(panel);

		panel.setBackground(Color.GREEN);

		Border border = BorderFactory.createLineBorder(Color.RED, 4);

		panel.setBorder(border);

		panel.add(tarea);

		tarea.setBackground(Color.BLACK);

		Border border1 = BorderFactory.createLineBorder(Color.BLUE);

		tarea.setBorder(border1);

		Font font = new Font("font", Font.BOLD, 20);

		tarea.setFont(font);

		tarea.setForeground(Color.cyan);

		tarea.setPreferredSize(new Dimension(400, 200));

		tarea.setLineWrap(true);

		// Buttons, Calculations and more!

		panel.add(button1);

		panel.add(button2);

		panel.add(button3);

		panel.add(button4);

		panel.add(button5);

		panel.add(button6);

		panel.add(button7);

		panel.add(button8);

		panel.add(button9);

		panel.add(button0);

		panel.add(buttoAdd);

		panel.add(buttonSub);

		panel.add(buttonMultiply);

		panel.add(buttonDivide);

		panel.add(buttonDot);

		panel.add(buttonClear);

		panel.add(buttonEqual);
		
		panel.add(Pi);
		
		panel.add(Square);
		
		panel.add(help);
		
		panel.add(fonz);
		
		panel.add(a);
		
		panel.add(sqrt);
		
		panel.add(c);
		
		panel.add(quad);
		
		panel.add(pent);

		sqrt.setPreferredSize(new Dimension(100, 43));
		sqrt.setText("Square Root");
		sqrt.setBackground(Color.ORANGE);
		
		pent.setPreferredSize(new Dimension(100, 43));
		pent.setText("Pent Root");
		pent.setBackground(Color.ORANGE);
		
		quad.setPreferredSize(new Dimension(100, 43));
		quad.setText("Quad Root");
		quad.setBackground(Color.ORANGE);
		
		c.setPreferredSize(new Dimension(100, 43));
		c.setText("Cubic Root");
		c.setBackground(Color.ORANGE);
		
		a.setPreferredSize(new Dimension(100, 43));
		a.setText("x² ");
		a.setBackground(Color.ORANGE);
		
		Square.setPreferredSize(new Dimension(100, 43));
		Square.setText("Square");
		Square.setBackground(Color.ORANGE);
		
		fonz.setPreferredSize(new Dimension(100, 43));
		fonz.setText("%");
		fonz.setBackground(Color.ORANGE);
		
		help.setPreferredSize(new Dimension(100, 43));
		help.setText("Help");
		help.setBackground(Color.ORANGE);
		
		Pi.setPreferredSize(new Dimension(100, 43));
		Pi.setText("Pi");
		Pi.setBackground(Color.ORANGE);
		
		
		button1.setPreferredSize(new Dimension(100, 43));
		button1.setText("1");
		button1.setBackground(Color.ORANGE);

		button1.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\button1.png"));
		button2.setText("2");
		button2.setBackground(Color.ORANGE);

		button2.setPreferredSize(new Dimension(100, 43));

		button2.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\2.png"));

		button3.setPreferredSize(new Dimension(100, 43));
		button3.setText("3");
		button3.setBackground(Color.ORANGE);
		button3.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\3.png"));

		button4.setPreferredSize(new Dimension(100, 43));
		button4.setText("4");
		button4.setBackground(Color.ORANGE);
		button4.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\4.png"));

		button5.setPreferredSize(new Dimension(100, 43));
		button5.setText("5");
		button5.setBackground(Color.ORANGE);
		button5.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\5.png"));

		button6.setPreferredSize(new Dimension(100, 43));
		button6.setText("6");
		button6.setBackground(Color.ORANGE);
		button6.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\6.png"));

		button7.setPreferredSize(new Dimension(100, 43));
		button7.setText("7");
		button7.setBackground(Color.ORANGE);
		button7.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\7.png"));

		button8.setPreferredSize(new Dimension(100, 43));
		button8.setText("8");
		button8.setBackground(Color.ORANGE);
		button8.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\8.png"));

		button9.setPreferredSize(new Dimension(100, 43));
		button9.setText("9");
		button9.setBackground(Color.ORANGE);
		button9.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\9.png"));

		buttoAdd.setPreferredSize(new Dimension(100, 43));
		buttoAdd.setText("+");
		buttoAdd.setBackground(Color.ORANGE);
		buttoAdd.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\add.png"));

		buttonSub.setPreferredSize(new Dimension(100, 43));
		buttonSub.setText("-");
		buttonSub.setBackground(Color.ORANGE);
		buttonSub.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\s.png"));

		buttonDivide.setPreferredSize(new Dimension(100, 43));
		buttonDivide.setText("/");
		buttonDivide.setBackground(Color.ORANGE);
		buttonDivide.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\d.png"));

		buttonMultiply.setPreferredSize(new Dimension(100, 43));
		buttonMultiply.setText("X");
		buttonMultiply.setBackground(Color.ORANGE);
		buttonMultiply.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\m.png"));

		buttonDot.setPreferredSize(new Dimension(100, 43));
		buttonDot.setText(".");
		buttonDot.setBackground(Color.ORANGE);
		buttonDot.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\dot.png"));

		button0.setPreferredSize(new Dimension(100, 43));
		button0.setText("0");
		button0.setBackground(Color.ORANGE);
		button0.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\0.png"));

		buttonClear.setPreferredSize(new Dimension(100, 43));
		buttonClear.setText("c");
		buttonClear.setBackground(Color.ORANGE);
		buttonClear.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\c.png"));

		buttonEqual.setPreferredSize(new Dimension(100, 43));
		buttonEqual.setText("=");
		buttonEqual.setBackground(Color.ORANGE);
		buttonEqual.setIcon(new ImageIcon("C:\\Users\\viraj\\Desktop\\Alegbra Eclipse Robotics\\Calculator\\equal.png"));

		Pi.addActionListener(this);
		
		quad.addActionListener(this);
		
		fonz.addActionListener(this);
		
		button1.addActionListener(this);

		button2.addActionListener(this);

		button3.addActionListener(this);

		button4.addActionListener(this);

		button5.addActionListener(this);

		button6.addActionListener(this);

		button7.addActionListener(this);

		button8.addActionListener(this);

		button9.addActionListener(this);

		button0.addActionListener(this);

		buttonClear.addActionListener(this);

		buttonDot.addActionListener(this);

		buttonDivide.addActionListener(this);

		buttoAdd.addActionListener(this);

		buttonSub.addActionListener(this);

		buttonEqual.addActionListener(this);

		buttonClear.addActionListener(this);

		buttonMultiply.addActionListener(this);
		
		Square.addActionListener(this);
		
		help.addActionListener(this);
		
		a.addActionListener(this);
		
		sqrt.addActionListener(this);
		
		c.addActionListener(this);
		
		pent.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == buttonClear) {
			number1 = 0.0;
			number2 = 0.0;

			tarea.setText("");
		}
		
		
		
		if (source == Pi) {
			result = Math2.PI;
			
			tarea.setText(Double.toString(result));
		}
		
		if (source == sqrt) {
			number1 = number_reader();
			
			result = Math.sqrt(number1);
			tarea.setText(Double.toString(result));
			
			
		}
		
		if (source == pent) {
			number1 = number_reader(); 
			
			result2 = number1;
			while (result2 > 0) {
				
				r=result2%10;
				
				sum=(sum*10)+r;
				
				result2=result2/10; 
			}
			
			if(result2==sum){
				
	
				tarea.setText(Double.toString(result2));
				
				tarea.append("palindrome number");
			}
			
			else
				
				tarea.setText(Double.toString(result2));
			
				tarea.append("not palindrome number");
			
		}
		
		if (source == c) {
			number1 = number_reader();
			
			result = Math.cbrt(number1);
			tarea.setText(Double.toString(result));
			
			
		}
		
		if (source == help) {
			tarea.append("Welcome to this Calulator made by Viraj. Thank You all." );
		}
		

		if (source == button1) {
			tarea.append("1");
		}

		if (source == button2) {
			tarea.append("2");
		}

		if (source == button3) {
			tarea.append("3");
		}

		if (source == button4) {
			tarea.append("4");
		}

		if (source == button5) {
			tarea.append("5");
		}

		if (source == button6) {
			tarea.append("6");
		}

		if (source == button7) {
			tarea.append("7");
		}

		if (source == button8) {
			tarea.append("8");
		}

		if (source == button9) {
			tarea.append("9");
		}

		if (source == button0) {
			tarea.append("0");
		}

		if (source == buttonDot) {
			tarea.append(".");
		}
		
		if (source == Square) {
			number1 = number_reader();
			tarea.setText("");
			addc = 0;
			divc = 0;
			subc = 0;
			mulc = 0;
			square = 1;
			d = 0;
			A = 0;
			
			if (square > 0) {
				result = number1 * number1;
				tarea.setText(Double.toString(result));
			}
		}
		
	

		if (source == buttoAdd) {
			number1 = number_reader();
			tarea.setText("");
			addc = 1;
			divc = 0;
			subc = 0;
			mulc = 0;
			square = 0;
			d = 0;
			A = 0;
		}

		if (source == buttonMultiply) {
			number1 = number_reader();
			tarea.setText("");
			addc = 0;
			divc = 0;
			subc = 0;
			mulc = 1;
			square = 0;
			d = 0;
			A = 0;
		}
		
		if (source == quad) {
			number1 = number_reader();
			
			result1 = Math.sqrt(number1);
		
			result = Math.sqrt(result1);
			tarea.setText(Double.toString(result));
		}
		
		if (source == fonz) {
			number1 = number_reader();
			tarea.setText("");
			addc = 0;
			divc = 0;
			subc = 0;
			mulc = 0;
			square = 1;
			d = 1;
			A = 0;
			
			if (d > 0) {
				result = number1 / 100;
				tarea.setText(Double.toString(result));
			}
			
			
		}

		

		if (source == buttonSub) {
			number1 = number_reader();
			tarea.setText("");
			addc = 0;
			divc = 0;
			subc = 1;
			mulc = 0;
			square = 0;
			d = 0;
			A = 0;
		}
		
		if (source == a) {
			number1 = number_reader();
			tarea.setText("");
			addc = 0;
			divc = 0;
			subc = 0;
			mulc = 0;
			square = 0;
			d = 0;
			A = 1;
			
		
		}
		
		if (source == buttonDivide) {
			number1 = number_reader();
			tarea.setText("");
			addc = 0;
			divc = 1;
			subc = 0;
			mulc = 0;
			square = 0;
			d = 0;
			A = 0;
			
		
		}

		if (source == buttonEqual) {
			number2 = number_reader();

			if (addc > 0) {
				result = number1 + number2;
				tarea.setText(Double.toString(result));
			}

			if (subc > 0) {
				result = number1 - number2;
				tarea.setText(Double.toString(result));
			}

			if (mulc > 0) {
				result = number1 * number2;
				tarea.setText(Double.toString(result));
			}

			if (divc > 0) {
				result = number1 / number2;
				tarea.setText(Double.toString(result));
			}
			
			if (A > 0) {
	
				double p = number1;
				for(int l = 0; l < number2 - 1; l++) {
					
					
					number1*=p;
					

					
							
				}
				
				result = number1;
				tarea.setText(Double.toString(result));
		
		
				
				
			}
		
		}

	}

	public double number_reader() {
		double num1;

		String s;

		s = tarea.getText();

		num1 = Double.valueOf(s);

		return num1;

	}

}
