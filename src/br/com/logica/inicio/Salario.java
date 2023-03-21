package br.com.logica.inicio;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double convenio_medico, vale_transporte, desconto, liquido, salario, valorcm, valorvt;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu salario:");
		salario = entrada.nextDouble();
		
		System.out.println("Digite seu desconto do convênio médico:");
		convenio_medico = entrada.nextDouble();
		
		System.out.println("Digite seu desconto do vale transporte:");
		vale_transporte = entrada.nextDouble();
		
			
		valorcm = salario * (convenio_medico/ 100);
		
		valorvt = salario * (vale_transporte/ 100);
		liquido = salario - valorvt - valorcm;
		
		
		
		
		
		
		
	
		
		
	}
}
