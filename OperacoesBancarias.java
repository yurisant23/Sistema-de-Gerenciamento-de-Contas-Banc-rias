public interface OperacoesBancarias {
    void depositar(double valor) throws ValorInvalidoException;
    void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException;
    void transferir(double valor, ContaBancaria destino) throws SaldoInsuficienteException, ValorInvalidoException;
}