public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        mensagem(smartTv);

        smartTv.ligar();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        mensagem(smartTv);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(14);
        System.out.println("Canal Atual: " + smartTv.volume);

        mensagem(smartTv);
        
        mensagem(smartTv);
        
    }


    public static void mensagem(SmartTv smartTv){
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume do Som: " + smartTv.volume);
    }

}
