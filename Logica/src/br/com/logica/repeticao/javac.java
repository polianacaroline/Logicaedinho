package br.com.logica.repeticao;

import javax.swing.JOptionPane;

public class javac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dec = 0, resto= 0, resultado = 0, mult = 1;
				dec = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero decimal"));
		     while(dec > 0 ) {
		    	 
		    	 resto = dec % 2;
		    	 dec = dec / 2;
		    	 resultado = resultado + resto * mult;
		    	 mult *= 10;
		     }
		     JOptionPane.showMessageDialog(null, resultado);
		     
	}

}
