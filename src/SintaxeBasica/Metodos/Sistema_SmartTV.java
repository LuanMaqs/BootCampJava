package SintaxeBasica.Metodos;

public class Sistema_SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 6; //volume de 0 a 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void voltarCanal(){
        canal--;
    }
}
