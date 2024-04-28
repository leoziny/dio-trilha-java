public class Usuario {
    public static void main(String[] args) throws Exception{
       SmartTv smartTv = new SmartTv();

       smartTv.ligar();
        smartTv.mudarCanal(10);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("A TV ligada ? " + smartTv.ligada);
        System.out.println("O canal atual: " + smartTv.canal);
        System.out.println("O volume atual: " + smartTv.volume);



    }
}