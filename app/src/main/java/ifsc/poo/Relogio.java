package ifsc.poo;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio() {
        this(0, 0, 0);
    }

    public Relogio(int hora) {
        this(hora, 0, 0);
    }

    public Relogio(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Relogio(int hora, int minuto, int segundo) {
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public void sincronizar(Relogio outro) {
        this.hora = outro.hora;
        this.minuto = outro.minuto;
        this.segundo = outro.segundo;
    }

    public int diferencaEmSegundos(Relogio outro) {
        int segundosThis = this.hora * 3600 + this.minuto * 60 + this.segundo;
        int segundosOutro = outro.hora * 3600 + outro.minuto * 60 + outro.segundo;
        return Math.abs(segundosThis - segundosOutro);
    }
}
