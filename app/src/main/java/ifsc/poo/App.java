package ifsc.poo;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        //Lâmpada
        System.out.println("\n Lâmpada");
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada(true);

        System.out.println("Lâmpada 1 está " + (l1.isLigada() ? "ligada" : "desligada"));
        System.out.println("Lâmpada 2 está " + (l2.isLigada() ? "ligada" : "desligada"));
        System.out.println("Total de lâmpadas criadas: " + Lampada.getTotal());

        // Pessoa
        System.out.println("\n Pessoa");
        Pessoa p1 = new Pessoa("111.222.333-44");
        Pessoa p2 = new Pessoa("", "Fulano da Silva");
        Pessoa p3 = new Pessoa("555.666.777-88", "Ciclano de Algo", 30);

        System.out.println("Pessoa 1: CPF=" + p1.getCpf() + ", Nome=" + p1.getNome() + ", Idade=" + p1.getIdade());
        System.out.println("Pessoa 2: CPF=" + p2.getCpf() + ", Nome=" + p2.getNome() + ", Idade=" + p2.getIdade());
        System.out.println("Pessoa 3: CPF=" + p3.getCpf() + ", Nome=" + p3.getNome() + ", Idade=" + p3.getIdade());


        System.out.println("Idade Alice: " + p1.getIdade());
        System.out.println("Idade Bruno: " + p2.getNome());

        //Retangulo
        System.out.println("\nRetângulo");
        Retangulo r1 = new Retangulo(5, 10);
        Retangulo r2 = new Retangulo(3, 8);
        Retangulo r3 = new Retangulo(0, -5); // Deve ser ajustado para 1x1

        System.out.println("Retângulo 1: Área=" + r1.calcularArea() + ", Perímetro=" + r1.calcularPerimetro());
        System.out.println("Retângulo 2: Área=" + r2.calcularArea() + ", Perímetro=" + r2.calcularPerimetro());
        System.out.println("Retângulo 3: Área=" + r3.calcularArea() + ", Perímetro=" + r3.calcularPerimetro());

        Retangulo maior = Retangulo.getMaiorArea();
        System.out.println("Maior área: " + maior.calcularArea());
        Retangulo menorPerim = Retangulo.getMenorPerimetro();
        System.out.println("Menor perímetro: " + menorPerim.calcularPerimetro());

        // Relógio
        System.out.println("\nRelógi");
        Relogio rel1 = new Relogio(14, 30, 45);
        Relogio rel2 = new Relogio(25, 70, 80); // Inválido, deve zerar
        Relogio rel3 = new Relogio(8, 15);

        System.out.println("Relógio 1: " + rel1.diferencaEmSegundos(rel3) + " segundos de diferença");
        rel2.sincronizar(rel1);
        System.out.println("Relógio 2 sincronizado com Relógio 1");

        //Classe Produto

        System.out.println("\nProduto");
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Mouse", 120.50);
        Produto produto3 = new Produto("Teclado", 250.75);

        System.out.println("Produto 1: " + p1.getNome() + ", Código: " + produto1.getCodigo());
        System.out.println("Produto 2: " + p2.getNome() + ", Código: " + produto2.getCodigo());
        System.out.println("Produto 3: " + p3.getNome() + ", Código: " + produto3.getCodigo());
        System.out.println("Total de produtos: " + Produto.getTotalProdutos());

        // Teste do CSV (simplificado sem collections)
        System.out.println("\nRegistro CSV:");
        String[] csv = Produto.getRegistroCSV();
        for (String linha : csv) {
            System.out.println(linha);
        }



        // eu mudaria o nome do atributo de ao contrário de desconto ser taxa, e um método que cálcule a o desconto a partir da taxa e o preço atual

        // Livro
        Livro livro = new Livro();

        livro.setTitulo("O Senhor dos Anéis - A Sociedade do Anel\n");
        livro.setAutor("J. R. R. Tolkien\n");
        livro.setGenero(" Fantasia, Aventura\n");
        livro.setNumPaginas(464);
        livro.setCapitulos(22);


    }
}
