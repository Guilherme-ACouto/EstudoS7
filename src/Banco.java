public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(800);

        try {
            cc.retirar(200); // Linha 13
        } catch (ContaCorrenteException e) {
            System.out.println("Exceção tratada: " + e.getMessage());
        } finally {
            System.out.println("Saldo após a tentativa de retirada: R$" + cc.getSaldo()); // Linha 24
        }

    }
}


