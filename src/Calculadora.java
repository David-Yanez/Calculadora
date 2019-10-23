
import javax.swing.*;
//import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora  {
JFrame principal = new JFrame ("Calculadora V2");
JButton suma = new JButton ("Suma");
JButton resta = new JButton ("Resta");
JButton multiplicacion = new JButton ("Multiplicacion");
JButton division = new JButton ("Division");
JLabel valor1 = new JLabel ("Primer Valor");
JLabel valor2 = new JLabel ("Segundo Valor");
JLabel valor3 = new JLabel ("Resultado");
JLabel valor4 = new JLabel ("");
JLabel valor5 = new JLabel ("=");
JTextField numero1 = new JTextField ();
JTextField numero2 = new JTextField ();
JTextField numero3 = new JTextField ();

Calculadora() {   // Metodo constructor 
	
	principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	principal.setSize(500, 300);
	principal.setVisible(true);
	principal.setLayout(null);

	// label
	principal.add(valor1);
	valor1.setBounds(50,50,100,50);
	principal.add(valor2);
	valor2.setBounds(170,50,100,50);
	principal.add(valor3);
	valor3.setBounds(300,50,100,50);
	principal.add(valor4);
	valor4.setBounds(140,85,100,50);
	principal.add(valor5);
	valor5.setBounds(265,85,100,50);
	//text
	principal.add(numero1);
	numero1.setBounds(50, 100, 70, 30);
	
	principal.add(numero2);
	numero2.setBounds(170, 100, 70, 30);
	
	principal.add(numero3);
	numero3.setBounds(300, 100, 70, 30);
	
	
	// botones 
	principal.add(suma);
	suma.setBounds(50, 200, 70, 50);
	suma.addActionListener(new suma());
	
	principal.add(resta);
	resta.setBounds(150, 200, 70, 50);
	resta.addActionListener(new resta());
	
	principal.add(multiplicacion);
	multiplicacion.setBounds(250, 200, 100, 50);
	multiplicacion.addActionListener(new multiplicacion());
	
	principal.add(division);
	division.setBounds(350, 200, 70, 50);
	division.addActionListener(new division());
	
}
class suma implements ActionListener {
	public void actionPerformed (ActionEvent e) {
		
		int num1, num2, suma;
			num1=Integer.parseInt (numero1.getText());
			num2=Integer.parseInt (numero2.getText());
			suma = num1 + num2;
			numero3.setText(Integer.toString(suma));
		}
}

class resta implements ActionListener {
	public void actionPerformed (ActionEvent e) {
		
		int num1, num2, resta;	

			num1=Integer.parseInt (numero1.getText());
			num2=Integer.parseInt (numero2.getText());
			resta = num1 - num2;
			numero3.setText(Integer.toString(resta));
			

		}
}
class division implements ActionListener {
	public void actionPerformed (ActionEvent e) {
		
		int num1, num2, division;	

			num1=Integer.parseInt (numero1.getText());
			num2=Integer.parseInt (numero2.getText());
			division = num1 / num2;
			numero3.setText(Integer.toString(division));
			

		}
}

class multiplicacion implements ActionListener {
	public void actionPerformed (ActionEvent e) {
		
		int num1, num2, multiplicacion;	

			num1=Integer.parseInt (numero1.getText());
			num2=Integer.parseInt (numero2.getText());
			multiplicacion = num1 * num2;
			numero3.setText(Integer.toString(multiplicacion));
		//JerssonAndrango	

		}
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora Calculadora = new Calculadora();
		
	

}
}
