package br.com.logica.repeticao;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,rs=1;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("entre com um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("entre com um número"));
        rs= n1;
        
        for(int i = 1 ; i < n2 ; i++) {
        rs *= n1;
       

       }
        JOptionPane.showMessageDialog(null, "O resultado da multiplicão é :"+rs);
        System.out.println(rs);
	}
	}
