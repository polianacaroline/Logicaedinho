package br.com.logica.repeticao;

import javax.swing.JOptionPane;

public class converterDecBin {

	public static void main(String[] args) {
		
		
   int decimal  ;
   

   decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um decimal:"));

   String binario = Integer.toBinaryString(decimal);

   System.out.println(binario);

   JOptionPane.showMessageDialog(null, "O resultado do binario é: " +binario);
	}
	
}  
		
		
	


