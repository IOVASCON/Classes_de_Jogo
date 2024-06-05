public class Heroi {
    // Propriedades da classe
    private String nome;
    private int idade;
    private String tipo;

    // Construtor da classe
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método para realizar o ataque
    public void atacar() {
        String ataque = "";
        switch (this.tipo.toLowerCase()) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "fez um ataque desconhecido";
                break;
        }
        System.out.println("O " + this.tipo + " " + this.nome + " de " + this.idade + " anos atacou usando " + ataque);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criação dos objetos herói com diferentes tipos
        Heroi mago = new Heroi("Gandalf", 150, "mago");
        Heroi guerreiro = new Heroi("Arthur", 30, "guerreiro");
        Heroi monge = new Heroi("Shaolin", 25, "monge");
        Heroi ninja = new Heroi("Naruto", 20, "ninja");

        // Realiza o ataque com cada herói
        mago.atacar();
        guerreiro.atacar();
        monge.atacar();
        ninja.atacar();
    }
}
