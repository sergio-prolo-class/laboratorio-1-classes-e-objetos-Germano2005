package ifsc.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private static Retangulo maiorArea;
    private static Retangulo menorPerimetro;

    public Retangulo(int largura, int altura) {
        this.largura = largura <= 0 ? 1 : largura;
        this.altura = altura <= 0 ? 1 : altura;

        atualizarMaiorArea(this);
        atualizarMenorPerimetro(this);
    }

    private static void atualizarMaiorArea(Retangulo r) {
        if (maiorArea == null || r.calcularArea() > maiorArea.calcularArea()) {
            maiorArea = r;
        }
    }

    private static void atualizarMenorPerimetro(Retangulo r) {
        if (menorPerimetro == null || r.calcularPerimetro() < menorPerimetro.calcularPerimetro()) {
            menorPerimetro = r;
        }
    }

    public int calcularArea() {
        return largura * altura;
    }

    public int calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static Retangulo getMaiorArea() {
        return maiorArea;
    }

    public static Retangulo getMenorPerimetro() {
        return menorPerimetro;
    }
}
