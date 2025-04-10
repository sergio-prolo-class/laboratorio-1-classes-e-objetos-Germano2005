package ifsc.poo;

public class Lampada {
    private boolean ligada;

    public void ligar(boolean ligada){
        this.ligada = ligada;
    }

    public void desligada(boolean ligada){
        this.ligada = ligada;
    }

    public boolean verEstado(){
        return this.ligada;
    }


}

