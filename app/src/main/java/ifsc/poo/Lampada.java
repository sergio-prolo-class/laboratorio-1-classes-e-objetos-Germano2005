package ifsc.poo;

public class Lampada {
    private boolean ligada;
    private static int total = 0;

    public Lampada() {
        this(false);
    }

    public Lampada(boolean estadoInicial) {
        this.ligada = estadoInicial;
        total++;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public boolean isLigada() {
        return ligada;
    }

    public static int getTotal() {
        return total;
    }
}

