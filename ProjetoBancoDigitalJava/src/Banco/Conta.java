package Banco;

public class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
        if (this.saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta de número: " + contaDestino.getNumero());
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
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

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Bancário ====");
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da conta: " + this.numero);
        System.out.println(String.format("Saldo atual: R$ %.2f", this.saldo));
        System.out.println("==========================");
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }
}
