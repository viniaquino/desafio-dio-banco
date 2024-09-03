package desafio_dio_bank;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe abstrata "Conta" define uma conta bancária genérica com operações básicas
 * como saque, depósito e transferência.
 */

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected List<Transacao> transacoes;
	
	/**
     * Construtor padrão que inicializa uma conta com a agência padrão e um número de conta sequencial.
     */
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.transacoes = new ArrayList<>();
	}
	
	/**
     * Realiza um saque na conta.
     */
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		transacoes.add(new Transacao("Saque", valor, saldo));
	}
	
	/**
     * Realiza um depósito na conta.
     */
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		transacoes.add(new Transacao("Depósito", valor, saldo));
	}
	
	/**
     * Realiza uma transferência de valores para outra conta.
     */
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		transacoes.add(new Transacao("Tranferência", valor, saldo));
	}
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	/**
     * Retorna a lista de transações realizadas na conta.
     */
	
	public List<Transacao> getTransacoes() {
		return transacoes;
	}
	
	/**
     * Imprime informações comuns da conta, como agência, número da conta e saldo.
     */
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	 /**
     * Imprime o histórico de transações da conta.
     */
	
	protected void imprimirHistoricoTransacoes() {
		System.out.println("Histórico de Transações:");
	    for (Transacao transacao : transacoes) {
	        System.out.println(transacao);
	    }
	
	}
}
