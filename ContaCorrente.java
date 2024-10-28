public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, double taxaManutencao) {
        super(numeroConta);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque deve ser positivo.");
        }
        if (valor + taxaManutencao > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= (valor + taxaManutencao);
    }
}