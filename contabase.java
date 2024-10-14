public abstract class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }
        saldo -= valor;
    }

    public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
        sacar(valor);
        destino.depositar(valor);
    }
}
