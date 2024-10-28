public class ContaPoupanca extends ContaBancaria {
    private double rendimentoMensal;

    public ContaPoupanca(String numeroConta, double rendimentoMensal) {
        super(numeroConta);
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimentoMensal;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque deve ser positivo.");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }
}