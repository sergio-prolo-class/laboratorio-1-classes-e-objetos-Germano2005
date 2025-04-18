package ifsc.poo;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        //Lâmpada
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();

        l1.ligar(true);

        l2.desligada(true);

        System.out.println("Primeira lâmpada: " + l1.verEstado());
        System.out.println("Segunda lâmpada: " + l2.verEstado());

        // Pessoa
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        int idadeAlice = 22, idadeBruno = 25;

        p1.setNome("Alice");
        p1.setIdade(idadeAlice);
        p2.setNome("Bruno");
        p2.setIdade(idadeBruno);

        p2.felizAniversario();
        p2.felizAniversario();
        p2.felizAniversario();

        System.out.println("Idade Alice: " + p1.getIdade());
        System.out.println("Idade Bruno: " + p2.getIdade());

        p1.setIdade(-44);
        //possível é, porém, não faz sentido ter uma idade negativa, nesses casos pode ser feito uma verificação

        p2.setNome("");
        //Consiguir eu consigo, porém também não faz sentido, novamente pode haver uma verificação nesses casos

        System.out.println("Idade Alice: " + p1.getIdade());
        System.out.println("Idade Bruno: " + p2.getNome());

        //Retangulo
        Retangulo retangulo = new Retangulo();
        //retangulo.setLargura(5);
        //retangulo.setAltura(4);

        float area = retangulo.getAltura() * retangulo.getLargura();
        System.out.println(area);

        float perimetro = retangulo.getAltura() + retangulo.getAltura() + retangulo.getLargura() + retangulo.getLargura();
        System.out.println(perimetro);

        Random numAleatorio = new Random();

        List <Retangulo> retangulos = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            float altura = numAleatorio.nextFloat(100f);
            float largura = numAleatorio.nextFloat(100f);
            Retangulo r = new Retangulo();
            r.setAltura(altura);
            r.setLargura(largura);
            retangulos.add(r);
        }

        for(Retangulo retangulo1 : retangulos){
            float area1 = retangulo1.getAltura() * retangulo.getLargura();
            System.out.println(area1);

            float perimetro1 = retangulo1.getAltura() + retangulo.getAltura() + retangulo.getLargura() + retangulo.getLargura();
            System.out.println(perimetro1);
        }

        // Relógio
        Relogio relogio = new Relogio();

        relogio.ajustaHora((byte) 14, (byte) 58, (byte) 32);
        System.out.println(relogio.toString());

        relogio.avancaMinuto();
        relogio.avancaMinuto();
        System.out.println(relogio.toString());

        relogio.ajustaHora((byte) 23, (byte) 59, (byte) 59);
        System.out.println(relogio.toString());

        relogio.avancaSegundo();
        System.out.println(relogio.toString());

        //deveria mudar na forma como é retornado a função getHora

        //Classe Produto

        Produto a = new Produto();
        Produto b = new Produto();

        a.setNome("Geladeira");
        a.setPreco(832);

        b.setNome("micro-ondas");
        b.setPreco(499);

        a.setDesconto(6);
        b.setDesconto(12);

        int precoFinal1 = a.getPreco() - a.getPreco() * (a.getDesconto()/100);
        int precoFinal2 = b.getPreco() - b.getPreco() * (b.getDesconto()/100);

        System.out.println("Preço final do produto A: " + precoFinal1);
        System.out.println("Preço final do produto B: " + precoFinal2);

        System.out.println(a.anuncio());
        System.out.println(b.anuncio());



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
