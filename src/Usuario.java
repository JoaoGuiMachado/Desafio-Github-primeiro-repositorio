public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar ();
        
        smartTv.mudarCanal(14);

        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

    }
}
