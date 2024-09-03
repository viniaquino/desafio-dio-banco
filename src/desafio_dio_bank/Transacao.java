package desafio_dio_bank;

import java.time.LocalDateTime;

public class Transacao {
	private String tipo;
	private double valor;
	private double saldoApos;
	private LocalDateTime dataHora;
	
	public Transacao(String tipo, double valor, double saldoApos) {
		this.tipo = tipo;
		this.valor = valor;
		this.saldoApos = saldoApos;
		this.dataHora = LocalDateTime.now();
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public double getSaldoApos() {
		return saldoApos;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	
	public String toString() {
		return "Transacao{" +
				"tipo='" + tipo + '\'' + 
				", valor=" + valor + 
				", saldoApos=" + saldoApos +
				", dataHora=" + dataHora +
				"}";
	}
}
