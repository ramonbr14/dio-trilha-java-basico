public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";

        switch (plano) {
            case "T": {
                System.out.println("5Gb de Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram Gratis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            } 
        
            default:
                break;
        }
    }
}
