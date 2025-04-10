package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void felizAniversario(){
        this.idade = this.idade + 1;
        System.out.println("Feliz aniversário");
    }
}
