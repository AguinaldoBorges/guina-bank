package objetos;

public class Cliente extends Pessoa {
    private double limite = 2000;
    private String tipo = "Comum";

    public Cliente(String nome) {
        super(nome);
    }

    public void consultarLimite() {
        System.out.println("Cliente: " + getNome() + " Tipo: " + tipo + " Limite: " + limite);
    }
}
