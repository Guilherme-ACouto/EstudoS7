public class ContaCorrente {
    private double saldo;
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
    public void retirar(double valor) throws ContaCorrenteException {
        if (saldo - valor <= 0)
            throw new SaldoInsuficienteException(String.format(
                    "O saldo R$ %.2f é insuficiente para sacar o valor R$ %.2f",
                    saldo, valor)
            );
        else
            this.saldo = saldo - valor;
    }
    public double getSaldo() {
        return saldo;
    }
}