package ifsc.poo;

public class Relogio {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public void ajustaHora(byte hora, byte minuto, byte segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Hora: " + hora + ":" + minuto + ":" + segundo;
    }

    public void avancaHora(){
        this.hora++;
    }

    public void avancaMinuto(){
        this.minuto++;
    }

    public void avancaSegundo(){
        this.segundo++;
    }

}
