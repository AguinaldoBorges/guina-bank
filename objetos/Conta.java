package objetos;

public class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente; // extends Cliente

    public Conta(int numeroDaConta, double saldo, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // metodos
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Conta: " + numeroDaConta);
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Conta: " + numeroDaConta);
        System.out.println("Saldo atual: " + saldo);
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Cliente: " + cliente.nome);
            System.out.println("Conta: " + numeroDaConta);
            System.out.println("Transferencia de " + valor + " realizada para a conta " + contaDestino.numeroDaConta);
        } else {
            System.out.println("Saldo insuficiente para transferencia de " + valor);
        }
    }

    public void consultar() {
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Conta: " + numeroDaConta);
        System.out.println("Saldo atual: " + saldo);
    }
}
