public class ResuldadoEscolar {
    public static void main(String[] args) {
        int nota = 1;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "EM Recuperação" : "Reprovado";

        System.out.println(resultado);

        /* Bloco if else if
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em recuperação");
        }else{
            System.out.println("Reprovado");   
        }*/
    }
}
