public class Banco {
    public static void main(String[] args) {
        try {
            ContaCorrente contaCorrente = new ContaCorrente();
            ContaPoupanca contaPoupanca = new ContaPoupanca();

            contaCorrente.depositar(1000);
            contaPoupanca.depositar(500);

            System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
            System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

            contaCorrente.transferir(200, contaPoupanca);

            System.out.println("Saldo Conta Corrente após transferência: " + contaCorrente.getSaldo());
            System.out.println("Saldo Conta Poupança após transferência: " + contaPoupanca.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
