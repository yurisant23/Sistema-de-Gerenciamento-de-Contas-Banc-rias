public abstract class ContaBancaria implements OperacoesBancarias {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito deve ser positivo.");
        }
        saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) throws SaldoInsuficienteException, ValorInvalidoException {
        sacar(valor);
        destino.depositar(valor);
    }
}