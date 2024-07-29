public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // TODO: Incrementar o saldo com o valor e imprimir "Deposito feito."
        saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();

    }

    public void sacar(double valor) {
        // TODO: Verificar se o saldo é suficiente considerando o valor:
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque Feito");
            imprimirSaldo();
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
            imprimirSaldo();
        }
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."

    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}

