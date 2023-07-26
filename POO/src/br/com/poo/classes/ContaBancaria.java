package br.com.poo.classes;

public abstract class ContaBancaria {
protected long numeroBanco;
protected long numeroAgencia;
protected long numeroConta;
protected String titular;
protected double saldo;

public double verificar() {
	return saldo;
	
}
public String depositar(Double valor) {
	saldo += valor;
	return "Depósito efetuado";
}
public String sacar(Double valor) {
	saldo -= valor;
	return "saque efetuado";
}

}
