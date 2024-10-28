public class Main {
    public static void main(String[] args) {
        try {
            ContaCorrente contaCorrente = new ContaCorrente("12345", 10.0);
            ContaPoupanca contaPoupanca = new ContaPoupanca("54321", 0.05);

            contaCorrente.depositar(100.0);
            System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());

            contaCorrente.sacar(50.0);
            System.out.println("Saldo Conta Corrente após saque: " + contaCorrente.getSaldo());

            contaCorrente.transferir(30.0, contaPoupanca);
            System.out.println("Saldo Conta Corrente após transferência: " + contaCorrente.getSaldo());
            System.out.println("Saldo Conta Poupança após transferência: " + contaPoupanca.getSaldo());

            contaPoupanca.aplicarRendimento();
            System.out.println("Saldo Conta Poupança após rendimento: " + contaPoupanca.getSaldo());

        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}