package br.com.poo.objetos;

import javax.swing.JOptionPane;

import br.com.poo.classes.Cliente;

public class UsarCliente {

	public static void main(String[] args) {
		//instanciar uma classe
		Cliente cli = new Cliente();
		cli.setIdCliente(10);
		cli.setNomeCliente("Wagner");
		cli.setEmailCliente("wagner@terra.com.br");
		cli.setIdadeCliente(23);
		cli.setCpfCliente("111444777-35");
		
		String retorno = cli.cadastro();
		JOptionPane.showMessageDialog(null, retorno);
		
		
		
		
	}

}
