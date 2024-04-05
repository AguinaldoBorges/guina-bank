import objetos.Cliente;

import objetos.Conta;

public class Main {
    public static void main(String[] args) {

        Cliente aguinaldo = new Cliente("Aguinaldo");
        Cliente churupita = new Cliente("Churupita");
        Cliente patinho = new Cliente("Patinho");

        Conta conta123 = new Conta(123, 10, aguinaldo);
        Conta conta456 = new Conta(456, 0, churupita);
        Conta conta171 = new Conta(171, 15000, patinho);

        System.out.println("_____________________");
        System.out.println("GUINA BANK");
        System.out.println("_____________________");
        System.out.println("");
        System.out.println("");
        System.out.println("_____________________");
        System.out.println("Clientes: ");
        System.out.println("_____________________");
        System.out.println("");
        conta123.consultar();
        System.out.println("_____________________");
        conta456.consultar();
        System.out.println("_____________________");
        conta171.consultar();
        System.out.println("_____________________");

        System.out.println("");
        System.out.println("");
        System.out.println("_____________________");
        System.out.println("Patinho sacou R$ 300,00: ");
        System.out.println("_____________________");
        System.out.println("");
        conta171.sacar(300);
        System.out.println("");
        System.out.println("");
        System.out.println("_____________________");
        System.out.println("Aguinaldo transfere R$5,00 para Churupita: ");
        System.out.println("_____________________");
        System.out.println("");
        conta123.transferir(5, conta456);
        System.out.println("");
        System.out.println("");
        System.out.println("_____________________");
        System.out.println("Patinho transfere R$1500,00 para Aguinaldo: ");
        System.out.println("_____________________");
        System.out.println("");
        conta171.transferir(1500, conta123);

    }
}
