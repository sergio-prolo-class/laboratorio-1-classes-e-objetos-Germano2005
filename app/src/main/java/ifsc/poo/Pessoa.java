package ifsc.poo;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String cpf) {
        this(cpf, "", 0);
    }

    public Pessoa(String cpf, String nome) {
        this(cpf, nome, 0);
    }

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf.isEmpty() ? "123.456.789-00" : cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
