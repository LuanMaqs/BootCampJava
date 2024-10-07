package SintaxeBasica.Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception{

        Sistema_SmartTV smartTv = new Sistema_SmartTV();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal da Tv: " + smartTv.canal);
        System.out.println("Volume Tv: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> : Tv ligada? " + smartTv.ligada);

        System.out.println("Canal da Tv: " + smartTv.canal);
        smartTv.mudarCanal(8);
        System.out.println("Canal da Tv: " + smartTv.canal);


        smartTv.aumentarVolume();
        System.out.println("volume aumentado para: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("volume diminuido para: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("volume aumentado para: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("volume diminuido para: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal da Tv: " + smartTv.canal);
    }
}
