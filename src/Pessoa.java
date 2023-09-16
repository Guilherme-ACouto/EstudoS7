public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(int idade, String nome){
        setIdade(idade);
        this.nome = nome;
    }

    public void setIdade(int idade) {
        //PRÉ-CONDIÇÃO
        assert(idade < 95);

        if (idade <= 0 || idade >= 130) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }
        this.idade = idade;
    }

    public static void main(String[] args) {
        System.out.println("Tentando criar uma pessoa com 20 anos...");
        Pessoa ze = new Pessoa(20, "Zé");

        System.out.println("Tentando criar uma pessoa com 100 anos...");
        Pessoa joao = new Pessoa(110, "João");
    }
}