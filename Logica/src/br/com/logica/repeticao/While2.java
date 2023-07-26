package br.com.logica.repeticao;

import javax.swing.JOptionPane;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String texto = JOptionPane.showInputDialog("Digite sair para frechar");
		
      while(!texto.equals("sair")) {
    	  
    	  JOptionPane.showConfirmDialog(null, "Você digitou o texto errado");
    	  
      }
		
		
	}

}
