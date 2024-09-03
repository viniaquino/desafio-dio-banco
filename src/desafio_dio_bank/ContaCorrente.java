package desafio_dio_bank;

public class ContaCorrente extends Conta {
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		super.imprimirHistoricoTransacoes();
	}
}
